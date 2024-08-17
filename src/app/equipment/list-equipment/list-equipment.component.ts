import { Component, OnInit } from '@angular/core';
import { EquipmentService } from '../../services/equipment.service';
import { Equipment } from '../../models/equipment.model';

@Component({
  selector: 'app-list-equipment',
  templateUrl: './list-equipment.component.html',
  styleUrls: ['./list-equipment.component.css']
})
export class ListEquipmentComponent implements OnInit {
  equipmentList: Equipment[] = [];

  constructor(private equipmentService: EquipmentService) {}

  ngOnInit(): void {
    this.loadEquipments();
  }

  loadEquipments(): void {
    this.equipmentService.getEquipments().subscribe(
      (data) => {
        this.equipmentList = data;
      },
      (error) => {
        console.error('Error fetching equipment list', error);
      }
    );
  }

  addNewEquipmentToList(equipment: Equipment): void {
    this.equipmentList.push(equipment);
  }

  deleteEquipment(id: number | undefined): void {
    this.equipmentService.deleteEquipment(id).subscribe(() => {
      this.loadEquipments();  // Refresh the list after deletion
    });
  }
}
