package edu.miu.cs489.lab10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.cs489.lab10.dto.address.AddressResponseWithPatient;
import edu.miu.cs489.lab10.service.AddressService;

@RestController
@RequestMapping(value = "/adsweb/api/v1/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping(value = "/list")
    public ResponseEntity<List<AddressResponseWithPatient>> getAllAddresses() {
        var addresses = addressService.getAllAddressesWithPatients();
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }
}
