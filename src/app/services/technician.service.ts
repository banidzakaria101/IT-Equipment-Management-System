import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Technician } from '../models/technician.model';

@Injectable({
  providedIn: 'root'
})
export class TechnicianService {
  private apiUrl = 'http://localhost:8080/api/technician'; 

  constructor(private http: HttpClient) {}

  // Add a new technician
  addTechnician(technician: Technician): Observable<Technician> {
    return this.http.post<Technician>(`${this.apiUrl}/add`, technician);
  }

  // Get all technicians
  getTechnicians(): Observable<Technician[]> {
    return this.http.get<Technician[]>(`${this.apiUrl}/list`);
  }

  // Delete a technician by ID
  deleteTechnician(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/delete/${id}`);
  }

  // Get a technician by ID
  getTechnician(id: number): Observable<Technician> {
    return this.http.get<Technician>(`${this.apiUrl}/${id}`);
  }
}
