package com.example.IT.support.App.services;

import com.example.IT.support.App.model.Technician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.IT.support.App.repository.TechnicianRepository;

import java.util.List;

@Service
public class TechnicianService {

    @Autowired
    private TechnicianRepository technicianRepository;

    public Technician add(Technician technician) {
        return technicianRepository.save(technician);
    }

    public void delete(Long id) {
        technicianRepository.deleteById(id);
    }

    public List<Technician> findAll() {
        return technicianRepository.findAll();
    }

    public Technician getTechnician(Long id) {
        return technicianRepository.findById(id).get();
    }
}
