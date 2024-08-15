// add-ticket.component.ts
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { TicketService } from '../../services/ticket.service'; // Adjust path based on your service location
import { EquipmentService } from '../../services/equipment.service'; // Adjust path based on your service location

@Component({
  selector: 'app-add-ticket',
  templateUrl: './add-ticket.component.html',
  styleUrls: ['./add-ticket.component.css']
})
export class AddTicketComponent implements OnInit {
  ticketForm!: FormGroup;
  equipments: any[] = []; // Placeholder type, adjust according to your model

  constructor(
    private fb: FormBuilder,
    private ticketService: TicketService,
    private equipmentService: EquipmentService
  ) {}

  ngOnInit(): void {
    this.ticketForm = this.fb.group({
      description: ['', Validators.required],
      equipment: ['', Validators.required],
      status: ['OPEN', Validators.required]
    });

    this.loadEquipments();
  }

  loadEquipments(): void {
    this.equipmentService.getEquipments().subscribe((data) => {
      this.equipments = data;
    });
  }

  onSubmit(): void {
    if (this.ticketForm.valid) {
      this.ticketService.addTicket(this.ticketForm.value).subscribe((response) => {
        console.log('Ticket created successfully:', response);
        // Optionally reset the form or redirect
      });
    }
  }
}
