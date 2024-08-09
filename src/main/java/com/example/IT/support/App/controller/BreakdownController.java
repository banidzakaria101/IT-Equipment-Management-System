package com.example.IT.support.App.controller;

import com.example.IT.support.App.services.BreakdownService;
import com.example.IT.support.App.services.EquipmentService;
import com.example.IT.support.App.model.Breakdown;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/breakdowns")
public class BreakdownController {

    @Autowired
    private BreakdownService breakdownService;

    @Autowired
    private EquipmentService equipmentService;

    @PostMapping("/add")
    public Breakdown addBreakdown(@RequestBody Breakdown breakdown) {
        return breakdownService.addBreakdown(breakdown);
    }

    @DeleteMapping
    public void deleteBreakdown(@RequestParam Long id){
        breakdownService.deleteBreakdownById(id);
    }


}
