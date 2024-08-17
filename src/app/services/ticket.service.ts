// src/app/services/ticket.service.ts
import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ticket } from '../models/ticket.model';

@Injectable({
  providedIn: 'root'
})
export class TicketService {
  private apiUrl = 'http://localhost:8080/api/tickets';

  constructor(private http: HttpClient) {}

  addTicket(ticket: Ticket): Observable<Ticket> {
    // Initialize HttpParams only if employeeId is defined
    let params = new HttpParams();
    if (ticket.employeeId !== undefined && ticket.employeeId !== null) {
      params = params.set('employeeId', ticket.employeeId.toString());
    }

    return this.http.post<Ticket>(`${this.apiUrl}/create`, ticket, { params });
  }

  getTickets(): Observable<Ticket[]> {
    return this.http.get<Ticket[]>(this.apiUrl);
  }
}
