// src/app/models/ticket.model.ts
import { Equipment } from './equipment.model';
import { TicketStatus } from '../enums/ticket-status.enum';

export interface Ticket {
  id?: number;
  description: string;
  equipment: Equipment;
  status: TicketStatus;
  employeeId?: number; // Add this if needed
}
