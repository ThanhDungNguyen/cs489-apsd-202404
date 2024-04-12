package edu.miu.cs489.lab6.service;

import edu.miu.cs489.lab6.model.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient addNewPatient(Patient newPatient);
    Patient updatePatient(Patient updatedPatient);
    boolean deletePatient(Long patientID);
}
