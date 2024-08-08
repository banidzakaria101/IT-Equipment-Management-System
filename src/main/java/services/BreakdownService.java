package services;

import repository.BreakdownRepository;
import model.Breakdown;
import model.Employee;
import model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BreakdownService {

    @Autowired
    private BreakdownRepository breakdownRepository;

    public Breakdown reportBreakdown(Equipment equipment, Employee employee, String description) {
        Breakdown breakdown = new Breakdown();
        breakdown.setEquipment(equipment);
        breakdown.setReportedBy(employee);
        breakdown.setDescription(description);
        breakdown.setStatus("Reported");

        return breakdownRepository.save(breakdown);
    }
}
