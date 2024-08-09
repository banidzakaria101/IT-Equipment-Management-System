package com.example.IT.support.App.repository;

import com.example.IT.support.App.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
  //  Ticket findTicketByName(Ticket ticket);
}
