import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminBoardComponent } from './admin/admin-board/admin-board.component';
import { EmployeePageComponent } from './employee/employee-page/employee-page.component';
import { AddTechnicianComponent } from './technician/add-technician/add-technician.component';
import { ListTechnicianComponent } from './technician/list-technician/list-technician.component';
import { TechnicianPageComponent } from './technician/technician-page/technician-page.component';
import { EmployeeBoardComponent } from './employee-board/employee-board.component';
import { AddTicketComponent } from './ticket/add-ticket/add-ticket.component';
import { ListTicketComponent } from './ticket/list-ticket/list-ticket.component';
import { EquipmentPageComponent } from './equipment/equipment-page/equipment-page.component';

const routes: Routes = [
  {
    path: 'admin-board',
    component: AdminBoardComponent,
    children: [
      { path: 'employee-page', component: EmployeePageComponent },
      { path: 'technician-page', component: TechnicianPageComponent },
      { path: 'add-technician', component: AddTechnicianComponent },
      { path: 'list-technician', component: ListTechnicianComponent },
      { path: 'equipment-page', component: EquipmentPageComponent}

    ],
  },
  {
    path: 'employee-board',
    component: EmployeeBoardComponent,
    children: [
      { path: 'create-ticket', component: AddTicketComponent },
      { path: 'tickets-list', component: ListTicketComponent },
      { path: '', redirectTo: 'create-ticket', pathMatch: 'full' } // Default route for employee-board
    ]
  },
  { path: '', redirectTo: '/admin-board/employee-page', pathMatch: 'full' }, // Default route
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
