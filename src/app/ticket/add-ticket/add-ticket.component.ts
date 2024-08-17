// src/app/components/add-ticket/add-ticket.component.ts
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { TicketService } from '../../services/ticket.service';
import { EquipmentService } from '../../services/equipment.service';
//import { AuthService } from '../../services/auth.service'; // Import AuthService
import { TicketStatus } from '../../enums/ticket-status.enum';
import { Ticket } from '../../models/ticket.model';
import { Equipment } from '../../models/equipment.model';

@Component({
  selector: 'app-add-ticket',
  templateUrl: './add-ticket.component.html',
  styleUrls: ['./add-ticket.component.css']
})
export class AddTicketComponent implements OnInit {
  ticketForm!: FormGroup;
  equipments: Equipment[] = [];
  statusOptions = Object.keys(TicketStatus).map(key => ({ key, value: TicketStatus[key as keyof typeof TicketStatus] }));
  employeeId!: number;

  constructor(
    private fb: FormBuilder,
    private ticketService: TicketService,
    private equipmentService: EquipmentService,
    //private authService: AuthService // Inject AuthService
  ) {}

  ngOnInit(): void {
    // Fetch the logged-in employee's ID
    //this.employeeId = this.authService.getLoggedInEmployeeId();

    this.ticketForm = this.fb.group({
      description: ['', Validators.required],
      equipment: ['', Validators.required],
      status: [TicketStatus.OPEN, Validators.required]
    });

    this.loadEquipments();
  }

  loadEquipments(): void {
    this.equipmentService.getEquipments().subscribe((data: Equipment[]) => {
      this.equipments = data;
    });
  }

  onSubmit(): void {
    if (this.ticketForm.valid) {
      const ticket: Ticket = this.ticketForm.value;
      ticket.employeeId = this.employeeId; // Set the employeeId dynamically
      this.ticketService.addTicket(ticket).subscribe(response => {
        console.log('Ticket created successfully:', response);
        // Optionally reset the form or show a success message
      });
    }
  }
}
