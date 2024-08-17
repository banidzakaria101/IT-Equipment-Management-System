package com.example.IT.support.App.services;

import com.example.IT.support.App.model.Employee;
import com.example.IT.support.App.model.EquipmentHistory;
import com.example.IT.support.App.repository.EmployeeRepository;
import com.example.IT.support.App.repository.EquipmentHistoryRepository;
import com.example.IT.support.App.repository.TechnicianRepository;
import com.example.IT.support.App.repository.TicketRepository;
import com.example.IT.support.App.model.Ticket;
import com.example.IT.support.App.model.Technician;
import com.example.IT.support.App.model.enums.TicketStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private TechnicianRepository technicianRepository;

    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    private EquipmentHistoryRepository equipmentHistoryRepo;

    public Ticket createTicket(Long employeeId, Ticket ticket) {

        Employee employee1 = employeeRepo.findById(employeeId).get();
        ticket.setEmployee(employee1);
        ticket.setCreatedDate(LocalDate.now());
        ticket.setStatus(TicketStatus.OPEN);

        Ticket ticket1 = ticketRepository.save(ticket);
        EquipmentHistory history = new EquipmentHistory();

        history.setTimestamp(LocalDateTime.now());
        history.setEquipment(ticket1.getEquipment());
        history.setAction("Ticket Created");
        history.setDetails("Ticket description: " + ticket1.getDescription());

        equipmentHistoryRepo.save(history);

        return ticket1;
    }

    public Ticket assignTicket(Long ticketId, Long technicianId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElseThrow();
        Technician technician = technicianRepository.findById(technicianId).orElseThrow();

        ticket.setTechnician(technician);
        ticket.setStatus(TicketStatus.ASSIGNED);

        return ticketRepository.save(ticket);
    }

    public Ticket updateTicket(Long ticketId, Long technicianId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElseThrow();
        Technician technician = ticket.getTechnician();
        ticket.setTechnician(technician);
        ticket.setStatus(TicketStatus.ASSIGNED);
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public List<Ticket> findTicketByEmployee(Long employeeId) {
        return ticketRepository.findTicketByEmployeeId(employeeId);    }

    public Ticket getTicketStatus(Long ticketId) {
        return ticketRepository.findById(ticketId).orElseThrow();
    }
}
