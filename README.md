# IT Equipment Management System

## Project Context

As a full-stack Java/Angular developer at ITSolutions, you are responsible for designing and developing an IT equipment management system.

## User Stories

### Gestion des Équipements Informatiques

- **As an IT administrator, I want to be able to add new IT equipment to the system to track their status and usage.**
- **As an IT administrator, I want to be able to modify the information of existing equipment to keep the data up to date.**
- **As an IT administrator, I want to be able to delete obsolete or out-of-service equipment to keep the system organized.**
- **As an IT administrator, I want to be able to see a list of all equipment with their current status for efficient management.**

### Suivi des Pannes

- **As a user, I want to be able to report a malfunction on equipment so that the IT service can take care of it.**
- **As an IT administrator, I want to be able to record detected malfunctions for effective tracking and repair.**
- **As an IT administrator, I want to be able to track the repair status of each reported malfunction to ensure a quick resolution.**
- **As an IT administrator, I want to be able to view the history of malfunctions for each piece of equipment to identify problematic equipment.**

### Gestion des Tickets de Support

- **As a user, I want to be able to create a support ticket to report a technical issue to receive help.**
- **As an IT administrator, I want to be able to assign support tickets to available technicians for quick resolution.**
- **As an IT technician, I want to be able to see the tickets assigned to me to handle them efficiently.**
- **As a user, I want to be able to track the status of my support ticket to know when my problem will be resolved.**

### Bonus: Rapports et Statistiques

- **As an IT administrator, I want to receive notifications for pending tickets to avoid missing important requests.**
- **As an IT administrator, I want to be able to see statistics on malfunctions to identify trends and recurring issues.**
- **As an IT administrator, I want to be able to generate reports on the state of equipment for better management.**
- **As an IT administrator, I want to be able to generate reports on the performance of the support service to improve efficiency.**

## Fonctionnement

- **An Equipment** can be associated with multiple Malfunctions. Each time a malfunction is detected or reported, a new entry is created in the Malfunction entity, linked to the concerned equipment. This allows tracking of all malfunctions of a particular piece of equipment.
- **The History of Malfunctions** keeps a detailed record of all past malfunctions for each piece of equipment. Each entry in the history is linked to an Equipment, thus keeping track of the problems encountered and the repairs performed.
- **Support Tickets** are created by Users when they encounter issues with equipment. Each ticket is thus linked to a specific user, allowing tracking of who reported the problem and maintaining effective communication.
- **Once a Support Ticket is created**, it is assigned to a Technician for resolution. This relationship allows tracking of which technician is responsible for resolving the problem and evaluating technicians' performance based on resolved tickets.
- **Generation of reports** including information on Equipment, Malfunctions, and Support Tickets. Reports are essential to assess the state of equipment, the frequency and nature of malfunctions, and the performance of technicians and the support service.

## Technologies Utilisées

- **Backend**: Spring Boot, Spring Data JPA, Spring Security
- **Frontend**: Angular 16
- **Database**: PostgreSQL / MySQL
- **Unit Testing**: JUnit
- **Containerization**: Docker

## Installation

1. Clone the repository
   ```bash
   git clone https://github.com/yourusername/it-equipment-management-system.git
