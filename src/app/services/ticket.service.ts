// ticket.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TicketService {
  private apiUrl = 'http://your-backend-api/tickets'; // Adjust URL

  constructor(private http: HttpClient) {}

  addTicket(ticket: any): Observable<any> {
    return this.http.post<any>(this.apiUrl, ticket);
  }

  getTickets(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }
}
