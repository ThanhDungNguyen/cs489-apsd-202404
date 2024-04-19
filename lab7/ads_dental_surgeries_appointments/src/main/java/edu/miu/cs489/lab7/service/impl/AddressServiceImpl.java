package edu.miu.cs489.lab7.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab7.model.Address;
import edu.miu.cs489.lab7.repository.AddressRepository;
import edu.miu.cs489.lab7.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressByID(Long addressID) {
        return addressRepository.findById(addressID).orElse(null);
    }

    @Override
    public Address addNewAddress(Address newAddress) {
        addressRepository.save(newAddress);
        return newAddress;
    }

    @Override
    public Address updateAddress(Address updatedAddress) {
        addressRepository.save(updatedAddress);
        return updatedAddress;
    }

    @Override
    public boolean deleteAddress(Long addressID) {
        addressRepository.deleteById(addressID);
        return true;
    }

}