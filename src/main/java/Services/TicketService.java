package Services;

import Repository.TicketRepository;
import model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepo;

    public Ticket addTicket(Ticket ticket){
        return ticketRepo.save(ticket);
    }

    public void deleteTicket(Ticket ticket){
        ticketRepo.delete(ticket);
    }

    public Ticket findTicketByName(Ticket ticket){
        return ticketRepo.findTicketByName(ticket);
    }
}
