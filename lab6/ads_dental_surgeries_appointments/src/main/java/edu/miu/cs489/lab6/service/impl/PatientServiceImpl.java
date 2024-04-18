package edu.miu.cs489.lab6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab6.model.Patient;
import edu.miu.cs489.lab6.repository.PatientRepository;
import edu.miu.cs489.lab6.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(String patientId) {
        return patientRepository.findById(patientId).orElse(null);
    }

    @Override
    public Patient addNewPatient(Patient newPatient) {
        patientRepository.save(newPatient);
        return newPatient;
    }

    @Override
    public Patient updatePatient(Patient updatedPatient) {
        patientRepository.save(updatedPatient);
        return updatedPatient;
    }

    @Override
    public boolean deletePatient(String patientId) {
        patientRepository.deleteById(patientId);
        return true;
    }

}