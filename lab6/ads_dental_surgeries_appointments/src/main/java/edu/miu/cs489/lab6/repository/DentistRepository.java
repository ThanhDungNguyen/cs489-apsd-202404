package edu.miu.cs489.lab6.repository;

import edu.miu.cs489.lab6.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
