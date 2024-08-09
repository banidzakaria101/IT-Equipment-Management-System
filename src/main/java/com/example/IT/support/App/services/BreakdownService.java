package com.example.IT.support.App.services;

import com.example.IT.support.App.repository.BreakdownRepository;
import com.example.IT.support.App.model.Breakdown;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreakdownService {

    @Autowired
    private BreakdownRepository breakdownRepo;

    public Breakdown addBreakdown(Breakdown breakdown) {
        return breakdownRepo.save(breakdown);
    }

    public List<Breakdown> getAllBreakdowns() {
        return breakdownRepo.findAll();
    }

    public Breakdown getBreakdownById(Long id){
        return breakdownRepo.findById(id).get();
    }

    public void deleteBreakdownById(Long id){
        breakdownRepo.deleteById(id);
    }



//    public Breakdown reportBreakdown(Equipment equipment, Employee employee, String description) {
//        Breakdown breakdown = new Breakdown();
//        breakdown.setEquipment(equipment);
//        breakdown.setReportedBy(employee);
//        breakdown.setDescription(description);
//        breakdown.setStatus("Reported");
//
//        return breakdownRepository.save(breakdown);
//    }
}
