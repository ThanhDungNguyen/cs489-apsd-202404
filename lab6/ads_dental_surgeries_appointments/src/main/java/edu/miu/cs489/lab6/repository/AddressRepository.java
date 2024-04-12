package edu.miu.cs489.lab6.repository;

import edu.miu.cs489.lab6.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
