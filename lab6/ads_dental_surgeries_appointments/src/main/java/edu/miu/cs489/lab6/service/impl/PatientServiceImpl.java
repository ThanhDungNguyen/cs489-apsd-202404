package edu.miu.cs489.lab6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab6.model.Patient;
import edu.miu.cs489.lab6.repository.PatientRepository;
import edu.miu.cs489.lab6.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPatients'");
    }

    @Override
    public Patient addNewPatient(Patient newPatient) {
        patientRepository.save(newPatient);
        return newPatient;
    }

    @Override
    public Patient updatePatient(Patient updatedPatient) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePatient'");
    }

    @Override
    public boolean deletePatient(Long patientID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePatient'");
    }

}