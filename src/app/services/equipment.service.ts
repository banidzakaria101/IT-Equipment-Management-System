import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Equipment } from '../models/equipment.model';

@Injectable({
  providedIn: 'root'
})
export class EquipmentService {

  private apiUrl = 'http://localhost:8080/api/equipment';

  constructor(private http: HttpClient) { }

  getEquipments(): Observable<Equipment[]> {
    return this.http.get<Equipment[]>(`${this.apiUrl}/list`);
  }


  addEquipment(equipment: Equipment): Observable<any> {
    return this.http.post<Equipment>(`${this.apiUrl}/add`, equipment);
  }
}
