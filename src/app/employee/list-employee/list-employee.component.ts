import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../../services/employee.service';  // Adjust the path as needed
import { Employee } from '../../models/employee.model';  // Adjust the path as needed

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {
  employees: Employee[] = [];

  constructor(private employeeService: EmployeeService) {}

  ngOnInit(): void {
    this.loadEmployees();
  }

  loadEmployees(): void {
    this.employeeService.getAllEmployees().subscribe(
      (data) => {
        this.employees = data;
      },
      (error) => {
        console.error('Error fetching employees', error);
      }
    );
  }

  deleteEmployee(id: number | undefined): void {
    this.employeeService.deleteEmployee(id).subscribe(() => {
      this.loadEmployees();  // Refresh the list after deletion
    });
  }
}
