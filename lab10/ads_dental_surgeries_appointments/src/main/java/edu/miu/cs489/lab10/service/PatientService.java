package edu.miu.cs489.lab10.service;

import java.util.List;

import edu.miu.cs489.lab10.dto.patient.PatientRequest;
import edu.miu.cs489.lab10.dto.patient.PatientResponse;
import edu.miu.cs489.lab10.exception.DataNotFoundException;

public interface PatientService {
    List<PatientResponse> getAllPatients();

    PatientResponse getPatientById(String patientId) throws DataNotFoundException;

    PatientResponse addNewPatient(PatientRequest newPatient);

    PatientResponse updatePatient(String patientId, PatientRequest updatedPatient) throws DataNotFoundException;

    void deletePatientById(String patientId) throws DataNotFoundException;

    List<PatientResponse> searchPatient(String searchString);
}
