package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.service;

import java.util.List;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model.Dentist;

public interface DentistService {
    List<Dentist> getAllDentists();

    Dentist getDentistByID(Long dentistID);

    Dentist addNewDentist(Dentist newDentist);

    Dentist updateDentist(Dentist updatedDentist);

    boolean deleteDentist(Long dentistID);
}
