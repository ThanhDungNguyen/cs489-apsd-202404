package edu.miu.cs489.lab7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs489.lab7.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
