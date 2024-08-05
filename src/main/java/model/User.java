package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.UserRole;

import java.util.List;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)

    private UserRole role;

    @OneToMany(mappedBy = "employee")
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "technician")
    private List<Ticket> assignedTicket;


}
