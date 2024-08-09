package com.example.IT.support.App.controller;

import com.example.IT.support.App.model.Technician;
import com.example.IT.support.App.services.TechnicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technician")
public class TechnicianController {

    @Autowired
    private TechnicianService technicianService;

    @PostMapping("/add")
    public Technician addTechnician(@RequestBody Technician technician){
        return technicianService.add(technician);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteTechnician(@PathVariable Long id){
        technicianService.delete(id);
    }

    @GetMapping("/list")
    public List<Technician> listTechnician(){
        return technicianService.findAll();
    }


}
