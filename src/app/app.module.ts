import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatCardModule } from '@angular/material/card';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { AdminBoardComponent } from './admin/admin-board/admin-board.component';
import { AddEmployeeComponent } from './employee/add-employee/add-employee.component';
import { ListEmployeeComponent } from './employee/list-employee/list-employee.component';
import { AddTechnicianComponent } from './technician/add-technician/add-technician.component';
import { ListTechnicianComponent } from './technician/list-technician/list-technician.component';
import { HttpClientModule } from '@angular/common/http';
import { EmployeePageComponent } from './employee/employee-page/employee-page.component';
import { TechnicianPageComponent } from './technician/technician-page/technician-page.component';
import { SidenavComponent } from './admin/admin-board/sidenav/sidenav.component';
import { ListTicketComponent } from './ticket/list-ticket/list-ticket.component';
import { EmployeeBoardComponent } from './employee-board/employee-board.component';
import { EmployeeSidenavComponent } from './employee-board/employee-sidenav/employee-sidenav.component';
import { AddTicketComponent } from './ticket/add-ticket/add-ticket.component';
import { AddEquipmentComponent } from './equipment/add-equipment/add-equipment.component';
import { ListEquipmentComponent } from './equipment/list-equipment/list-equipment.component';
import { EquipmentPageComponent } from './equipment/equipment-page/equipment-page.component';
import { LoginComponent } from './login/login.component';
import { TechnicianBoardComponent } from './technician-board/technician-board.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminBoardComponent,
    AddEmployeeComponent,
    ListEmployeeComponent,
    AddTechnicianComponent,
    ListTechnicianComponent,
    EmployeePageComponent,
    TechnicianPageComponent,
    SidenavComponent,
    AddTicketComponent,
    ListTicketComponent,
    EmployeeBoardComponent,
    EmployeeSidenavComponent,
    AddEquipmentComponent,
    ListEquipmentComponent,
    EquipmentPageComponent,
    LoginComponent,
    TechnicianBoardComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatInputModule,
    AppRoutingModule,
    FormsModule,
    MatButtonModule,
    MatFormFieldModule,
    MatCardModule,
    ReactiveFormsModule,

  ],
  providers: [
    provideAnimationsAsync()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
