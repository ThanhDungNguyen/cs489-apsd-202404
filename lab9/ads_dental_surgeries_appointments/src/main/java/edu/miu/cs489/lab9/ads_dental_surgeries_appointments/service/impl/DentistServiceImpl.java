package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model.Dentist;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.repository.DentistRepository;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.service.DentistService;

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
