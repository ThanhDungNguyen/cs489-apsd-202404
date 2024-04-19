package edu.miu.cs489.lab7.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab7.model.Dentist;
import edu.miu.cs489.lab7.repository.DentistRepository;
import edu.miu.cs489.lab7.service.DentistService;

import java.util.List;

@Service
public class DentistServiceImpl implements DentistService {
    @Autowired
    private DentistRepository dentistRepository;

    @Override
    public List<Dentist> getAllDentists() {
        return dentistRepository.findAll();
    }

    @Override
    public Dentist getDentistByID(Long dentistID) {
        return dentistRepository.findById(dentistID).orElse(null);
    }

    @Override
    public Dentist addNewDentist(Dentist newDentist) {
        dentistRepository.save(newDentist);
        return newDentist;
    }

    @Override
    public Dentist updateDentist(Dentist updatedDentist) {
        dentistRepository.save(updatedDentist);
        return updatedDentist;
    }

    @Override
    public boolean deleteDentist(Long dentistID) {
        dentistRepository.deleteById(dentistID);
        return true;
    }
}
