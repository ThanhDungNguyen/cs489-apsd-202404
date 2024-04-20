package edu.miu.cs489.lab7.service.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab7.dto.address.AddressAdapter;
import edu.miu.cs489.lab7.dto.address.AddressRequest;
import edu.miu.cs489.lab7.dto.address.AddressResponse;
import edu.miu.cs489.lab7.model.Address;
import edu.miu.cs489.lab7.repository.AddressRepository;
import edu.miu.cs489.lab7.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<AddressResponse> getAllAddresses() {
        var addresses = addressRepository.findAll();
        return addresses.stream().map(address -> AddressAdapter.getAddressResponseFromAddress(address))
                .collect(Collectors.toList());
    }

    @Override
    public AddressResponse getAddressByID(Long addressID) throws Exception {
        var address = addressRepository.findById(addressID).orElseThrow(() -> new Exception("No data"));
        return AddressAdapter.getAddressResponseFromAddress(address);
    }

    @Override
    public AddressResponse addNewAddress(AddressRequest newAddressRequest) {
        var newAddress = AddressAdapter.getAddressFromAddressRequest(newAddressRequest);
        addressRepository.save(newAddress);
        return AddressAdapter.getAddressResponseFromAddress(newAddress);
    }

    @Override
    public AddressResponse updateAddress(AddressRequest updatedAddressRequest) {
        var updatedAddress = AddressAdapter.getAddressFromAddressRequest(updatedAddressRequest);
        addressRepository.save(updatedAddress);
        return AddressAdapter.getAddressResponseFromAddress(updatedAddress);
    }

    @Override
    public boolean deleteAddress(Long addressID) {
        addressRepository.deleteById(addressID);
        return true;
    }

}