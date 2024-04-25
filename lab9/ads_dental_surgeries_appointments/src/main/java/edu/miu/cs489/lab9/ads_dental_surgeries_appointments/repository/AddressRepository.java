package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
