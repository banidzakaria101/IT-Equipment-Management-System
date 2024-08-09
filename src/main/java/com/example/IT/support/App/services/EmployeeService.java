package com.example.IT.support.App.services;

import com.example.IT.support.App.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.IT.support.App.repository.EmployeeRepository;
import com.example.IT.support.App.repository.EquipmentHistoryRepository;
import com.example.IT.support.App.repository.TicketRepository;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    private TicketRepository ticketRepo;

    @Autowired
    private EquipmentHistoryRepository equipmentHistoryRepo;



    public Optional<Employee> findEmployeeById(Long employeeId) {
        return employeeRepo.findById(employeeId);
    }
}
