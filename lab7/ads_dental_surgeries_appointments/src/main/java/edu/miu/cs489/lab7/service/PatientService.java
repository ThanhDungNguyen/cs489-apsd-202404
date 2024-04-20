package edu.miu.cs489.lab7.service;

import java.util.List;

import edu.miu.cs489.lab7.dto.patient.PatientRequest;
import edu.miu.cs489.lab7.dto.patient.PatientResponse;

public interface PatientService {
    List<PatientResponse> getAllPatients();

    PatientResponse getPatientById(String patientId);

    PatientResponse addNewPatient(PatientRequest newPatient);

    PatientResponse updatePatient(PatientRequest updatedPatient);

    boolean deletePatient(String patientId);
}
