package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<UserDetails> findByUsername(String username);
}
