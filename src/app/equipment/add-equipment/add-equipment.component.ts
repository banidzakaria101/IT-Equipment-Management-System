import { Component, EventEmitter, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EquipmentService } from '../../services/equipment.service';
import { Equipment } from '../../models/equipment.model';
import { EquipmentStatusOptions } from '../../enums/equipment-status.enum';

@Component({
  selector: 'app-add-equipment',
  templateUrl: './add-equipment.component.html',
  styleUrls: ['./add-equipment.component.css']
})
export class AddEquipmentComponent {
  @Output() equipmentAdded = new EventEmitter<Equipment>();  // Emit event when equipment is added

  equipmentForm: FormGroup;
  statusOptions = EquipmentStatusOptions;

  constructor(private fb: FormBuilder, private equipmentService: EquipmentService) {
    this.equipmentForm = this.fb.group({
      name: ['', Validators.required],
      status: ['', Validators.required]
    });
  }

  onSubmit() {
    if (this.equipmentForm.valid) {
      this.equipmentService.addEquipment(this.equipmentForm.value).subscribe(response => {
        this.equipmentAdded.emit(response);  // Emit the added equipment
      });
    }
  }
}
