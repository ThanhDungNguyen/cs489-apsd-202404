package edu.miu.cs489.lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientRepository, Long> {
}
