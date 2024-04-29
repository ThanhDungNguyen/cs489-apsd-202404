package edu.miu.cs489.lab11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs489.lab11.model.Surgery;

public interface SurgeryRepository extends JpaRepository<Surgery, String> {
}
