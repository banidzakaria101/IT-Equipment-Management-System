import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminBoardComponent } from './admin/admin-board/admin-board.component';
import { EmployeePageComponent } from './employee/employee-page/employee-page.component';
import { AddTechnicianComponent } from './technician/add-technician/add-technician.component';
import { ListTechnicianComponent } from './technician/list-technician/list-technician.component';
import { TechnicianPageComponent } from './technician/technician-page/technician-page.component';

const routes: Routes = [
  {
    path: 'admin-board',
    component: AdminBoardComponent,
    children: [
      { path: 'employee-page', component: EmployeePageComponent },
      { path: 'technician-page', component: TechnicianPageComponent },
      { path: 'add-technician', component: AddTechnicianComponent },
      { path: 'list-technician', component: ListTechnicianComponent },
      { path: 'add-technician', component: AddTechnicianComponent },
      { path: 'list-technician', component: ListTechnicianComponent },
    ],
  },
  { path: '', redirectTo: '/admin-board/employee-page', pathMatch: 'full' }, // Default route
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
