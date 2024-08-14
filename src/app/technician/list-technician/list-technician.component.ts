import { Component, OnInit } from '@angular/core';
import { TechnicianService } from '../../services/technician.service';

@Component({
  selector: 'app-list-technician',
  templateUrl: './list-technician.component.html',
  styleUrls: ['./list-technician.component.css']
})
export class ListTechnicianComponent implements OnInit {
  technicians: any[] = [];

  constructor(private technicianService: TechnicianService) {}

  ngOnInit() {
    this.loadTechnicians();
  }

  loadTechnicians() {
    this.technicianService.getTechnicians().subscribe((data: any[]) => {
      this.technicians = data;
    });
  }

  deleteTechnician(id: number) {
    this.technicianService.deleteTechnician(id).subscribe(() => {
      this.loadTechnicians();
    });
  }
}
