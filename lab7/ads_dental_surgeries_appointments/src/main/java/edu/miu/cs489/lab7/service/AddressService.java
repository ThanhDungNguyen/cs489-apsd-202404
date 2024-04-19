package edu.miu.cs489.lab7.service;

import java.util.List;

import edu.miu.cs489.lab7.model.Address;

public interface AddressService {
    List<Address> getAllAddresses();

    Address getAddressByID(Long addressID);

    Address addNewAddress(Address newAddress);

    Address updateAddress(Address updatedAddress);

    boolean deleteAddress(Long addressID);
}
