package edu.miu.cs489.lab7.service;

import java.util.List;

import edu.miu.cs489.lab7.dto.address.AddressRequest;
import edu.miu.cs489.lab7.dto.address.AddressResponse;
import edu.miu.cs489.lab7.dto.address.AddressResponseWithPatient;

public interface AddressService {
    List<AddressResponse> getAllAddresses();

    List<AddressResponseWithPatient> getAllAddressesWithPatients();

    AddressResponse getAddressByID(Long addressID) throws Exception;

    AddressResponse addNewAddress(AddressRequest newAddress);

    AddressResponse updateAddress(AddressRequest updatedAddress);

    boolean deleteAddress(Long addressID);
}
