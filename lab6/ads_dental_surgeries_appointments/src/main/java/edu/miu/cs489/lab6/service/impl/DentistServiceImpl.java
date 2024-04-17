package edu.miu.cs489.lab6.service.impl;

import edu.miu.cs489.lab6.model.Dentist;
import edu.miu.cs489.lab6.repository.DentistRepository;
import edu.miu.cs489.lab6.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistServiceImpl implements DentistService {
    @Autowired
    private DentistRepository dentistRepository;

    @Override
    public List<Dentist> getAllDentists() {
        return null;
    }

    @Override
    public Dentist addNewDentist(Dentist newDentist) {
        dentistRepository.save(newDentist);
        return newDentist;
    }

    @Override
    public Dentist updateDentist(Dentist updatedDentist) {
        return null;
    }

    @Override
    public boolean deleteDentist(Long dentistID) {
        return false;
    }
}