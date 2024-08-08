package services;

import model.Employee;
import model.Ticket;
import model.enums.TicketStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;
import repository.TicketRepository;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    private TicketRepository ticketRepo;

    public Ticket createTicket(Long employeeId, Ticket ticket) {

        Employee employee1 = employeeRepo.findById(employeeId).get();


        ticket.setEmployee(employee1);
        ticket.setCreatedDate(LocalDate.now());
        ticket.setStatus(TicketStatus.ASSIGNED);

        return ticketRepo.save(ticket);
    }

    public Optional<Employee> findEmployeeById(Long employeeId) {
        return employeeRepo.findById(employeeId);
    }
}
