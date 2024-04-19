package edu.miu.cs489.lab7.service;

import java.util.List;

import edu.miu.cs489.lab7.model.Patient;

public interface PatientService {
    List<Patient> getAllPatients();

    Patient getPatientById(String patientId);

    Patient addNewPatient(Patient newPatient);

    Patient updatePatient(Patient updatedPatient);

    boolean deletePatient(String patientId);
}
