import { Component } from '@angular/core';

@Component({
  selector: 'app-employee-page',
  templateUrl: './employee-page.component.html',
  styleUrls: ['./employee-page.component.css']
})
export class EmployeePageComponent {
  showAddEmployee = true; // Default to showing add employee form

  constructor() {}
}
