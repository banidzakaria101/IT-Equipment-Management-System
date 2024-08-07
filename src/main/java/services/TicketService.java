package services;

import repository.TechnicianRepository;
import repository.TicketRepository;
import model.Ticket;
import model.Technician;
import model.enums.TicketStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private TechnicianRepository technicianRepository;

    public Ticket assignTicket(Long ticketId, Long technicianId) {
        Ticket ticket = ticketRepository.findById(ticketId).orElseThrow();
        Technician technician = technicianRepository.findById(technicianId).orElseThrow();

        ticket.setTechnician(technician);
        ticket.setStatus(TicketStatus.ASSIGNED);

        return ticketRepository.save(ticket);
    }
}
