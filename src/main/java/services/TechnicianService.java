package services;

import model.Technician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TechnicianRepository;

import java.util.List;
import java.util.Optional;

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
