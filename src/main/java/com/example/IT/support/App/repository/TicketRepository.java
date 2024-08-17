package com.example.IT.support.App.repository;

import com.example.IT.support.App.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findTicketByEmployeeId(Long id);
}
