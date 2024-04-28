package edu.miu.cs489.lab10.dto.patient;

import java.time.LocalDate;

import edu.miu.cs489.lab10.dto.address.AddressRequest;

public record PatientRequest(String id,
        String firstName,
        String lastName,
        String phoneNumber,
        String email,
        LocalDate dateOfBirth,
        AddressRequest address) {

}
