import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { TechnicianService } from '../../services/technician.service';
import { Technician } from '../../models/technician.model';

@Component({
  selector: 'app-add-technician',
  templateUrl: './add-technician.component.html',
  styleUrls: ['./add-technician.component.scss']
})
export class AddTechnicianComponent {
  technicianForm: FormGroup;

  constructor(private fb: FormBuilder, private technicianService: TechnicianService) {
    this.technicianForm = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required],
    });
  }


  onSubmit() {
    if (this.technicianForm.valid) {
      const { username, password } = this.technicianForm.value;
      const newTechnician = new Technician(username, password);

      this.technicianService.addTechnician(newTechnician).subscribe(
        response => {
          window.location.reload();

        }
      );
    }
  }
}
