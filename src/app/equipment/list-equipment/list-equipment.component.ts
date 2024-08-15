import { Component, OnInit } from '@angular/core';
import { EquipmentService } from '../../services/equipment.service'; // Import the EquipmentService

@Component({
  selector: 'app-list-equipment',
  templateUrl: './list-equipment.component.html',
  styleUrls: ['./list-equipment.component.css']
})
export class ListEquipmentComponent implements OnInit {
deleteEquipment(arg0: any) {
throw new Error('Method not implemented.');
}
  equipmentList: any[] = [];

  constructor(private equipmentService: EquipmentService) {} // Inject the service here

  ngOnInit() {
    this.equipmentService.getEquipments().subscribe(data => {
      this.equipmentList = data;
    });
  }
}
