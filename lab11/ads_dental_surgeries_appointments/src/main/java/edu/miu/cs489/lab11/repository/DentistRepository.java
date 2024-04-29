package edu.miu.cs489.lab11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs489.lab11.model.Dentist;

public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
