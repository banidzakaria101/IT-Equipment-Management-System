package com.example.IT.support.App.repository;

import com.example.IT.support.App.model.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technician, Long> {
}
