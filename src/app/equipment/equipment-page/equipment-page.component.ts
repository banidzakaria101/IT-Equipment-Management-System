import { Component, ViewChild } from '@angular/core';
import { ListEquipmentComponent } from '../list-equipment/list-equipment.component';
import { Equipment } from '../../models/equipment.model';

@Component({
  selector: 'app-equipment-page',
  templateUrl: './equipment-page.component.html',
  styleUrls: ['./equipment-page.component.css']
})
export class EquipmentPageComponent {
  @ViewChild(ListEquipmentComponent) listComponent!: ListEquipmentComponent;

  onEquipmentAdded(equipment: Equipment): void {
    this.listComponent.addNewEquipmentToList(equipment);
  }
}
