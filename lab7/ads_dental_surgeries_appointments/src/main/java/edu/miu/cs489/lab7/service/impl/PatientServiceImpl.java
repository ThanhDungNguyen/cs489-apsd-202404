package edu.miu.cs489.lab7.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab7.dto.patient.PatientAdapter;
import edu.miu.cs489.lab7.dto.patient.PatientRequest;
import edu.miu.cs489.lab7.dto.patient.PatientResponse;
import edu.miu.cs489.lab7.exception.DataNotFoundException;
import edu.miu.cs489.lab7.model.Patient;
import edu.miu.cs489.lab7.repository.PatientRepository;
import edu.miu.cs489.lab7.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<PatientResponse> getAllPatients() {
        var patients = patientRepository.findAll();
        return patients.stream().sorted(Comparator.comparing(Patient::getLastName).reversed())
                .map(patient -> PatientAdapter.getPatientResponseFromPatient(patient))
                .collect(Collectors.toList());
    }

    @Override
    public PatientResponse getPatientById(String patientId) throws DataNotFoundException {
        var patient = patientRepository.findById(patientId).orElseThrow(
                () -> new DataNotFoundException(String.format("Patient with ID, %s, is not found", patientId)));
        return PatientAdapter.getPatientResponseFromPatient(patient);
    }

    @Override
    public PatientResponse addNewPatient(PatientRequest newPatientRequest) {
        var newPatient = PatientAdapter.getPatientFromPatientRequest(newPatientRequest);
        patientRepository.save(newPatient);
        return PatientAdapter.getPatientResponseFromPatient(newPatient);
    }

    @Override
    public PatientResponse updatePatient(PatientRequest updatedPatient) {
        // patientRepository.save(updatedPatient);
        // return updatedPatient;
        return null;
    }

    @Override
    public boolean deletePatient(String patientId) {
        patientRepository.deleteById(patientId);
        return false;
    }

}