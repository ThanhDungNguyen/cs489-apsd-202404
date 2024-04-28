package edu.miu.cs489.lab10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs489.lab10.model.Dentist;

public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
