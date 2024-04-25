package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.service;

import java.util.List;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.patient.PatientRequest;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.patient.PatientResponse;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.exception.DataNotFoundException;

public interface PatientService {
    List<PatientResponse> getAllPatients();

    PatientResponse getPatientById(String patientId) throws DataNotFoundException;

    PatientResponse addNewPatient(PatientRequest newPatient);

    PatientResponse updatePatient(String patientId, PatientRequest updatedPatient) throws DataNotFoundException;

    void deletePatientById(String patientId) throws DataNotFoundException;

    List<PatientResponse> searchPatient(String searchString);
}
