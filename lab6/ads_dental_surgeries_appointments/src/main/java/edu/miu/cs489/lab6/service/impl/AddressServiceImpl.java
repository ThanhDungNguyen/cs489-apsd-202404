package edu.miu.cs489.lab6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab6.model.Address;
import edu.miu.cs489.lab6.repository.AddressRepository;
import edu.miu.cs489.lab6.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddresses() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAddresses'");
    }

    @Override
    public Address addNewAddress(Address newAddress) {
        addressRepository.save(newAddress);
        return newAddress;
    }

    @Override
    public Address updateAddress(Address updatedAddress) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAddress'");
    }

    @Override
    public boolean deleteAddress(Long addressID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAddress'");
    }

}