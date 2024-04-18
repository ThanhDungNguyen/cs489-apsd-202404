package edu.miu.cs489.lab6.repository;

import edu.miu.cs489.lab6.model.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryRepository extends JpaRepository<Surgery, String> {
}
