package edu.miu.cs489.lab6.service;

import edu.miu.cs489.lab6.model.Dentist;

import java.util.List;

public interface DentistService {
    List<Dentist> getAllDentists();

    Dentist addNewDentist(Dentist newDentist);

    Dentist updateDentist(Dentist updatedDentist);

    boolean deleteDentist(Long dentistID);
}
