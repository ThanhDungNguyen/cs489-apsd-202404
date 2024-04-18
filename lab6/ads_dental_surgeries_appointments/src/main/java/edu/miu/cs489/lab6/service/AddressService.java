package edu.miu.cs489.lab6.service;

import edu.miu.cs489.lab6.model.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddresses();

    Address getAddressByID(Long addressID);

    Address addNewAddress(Address newAddress);

    Address updateAddress(Address updatedAddress);

    boolean deleteAddress(Long addressID);
}
