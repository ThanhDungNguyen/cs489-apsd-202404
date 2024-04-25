package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
