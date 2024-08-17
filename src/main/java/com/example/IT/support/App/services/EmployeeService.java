package com.example.IT.support.App.services;

import com.example.IT.support.App.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.IT.support.App.repository.EmployeeRepository;
import com.example.IT.support.App.repository.EquipmentHistoryRepository;
import com.example.IT.support.App.repository.TicketRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    private TicketRepository ticketRepo;

    @Autowired
    private EquipmentHistoryRepository equipmentHistoryRepo;

    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteById(id);
    }

//    public Employee updateEmployee(Employee employee) {
//        return employeeRepo.save(employee);
//    }

    public Optional<Employee> findEmployeeById(Long employeeId) {
        return employeeRepo.findById(employeeId);
    }
}
