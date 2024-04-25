package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, String> {

    @Query("SELECT p FROM Patient p WHERE p.id LIKE :keyword " +
            "OR p.firstName LIKE :keyword " +
            "OR p.lastName LIKE :keyword " +
            "OR p.phoneNumber LIKE :keyword " +
            "OR p.email LIKE :keyword ")
    List<Patient> searchByKeyword(String keyword);
}
