package edu.miu.cs489.lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs489.lab6.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, String> {
}
