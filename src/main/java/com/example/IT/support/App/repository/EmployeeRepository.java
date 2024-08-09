package com.example.IT.support.App.repository;

import com.example.IT.support.App.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
