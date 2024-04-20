package edu.miu.cs489.lab7.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab7.dto.patient.PatientRequest;
import edu.miu.cs489.lab7.dto.patient.PatientResponse;
import edu.miu.cs489.lab7.repository.PatientRepository;
import edu.miu.cs489.lab7.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<PatientResponse> getAllPatients() {
        // return patientRepository.findAll();
        return null;
    }

    @Override
    public PatientResponse getPatientById(String patientId) {
        // return patientRepository.findById(patientId).orElse(null);
        return null;
    }

    @Override
    public PatientResponse addNewPatient(PatientRequest newPatient) {
        // patientRepository.save(newPatient);
        // return newPatient;
        return null;
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