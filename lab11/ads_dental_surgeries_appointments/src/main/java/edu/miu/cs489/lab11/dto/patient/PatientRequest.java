package edu.miu.cs489.lab11.dto.patient;

import java.time.LocalDate;

import edu.miu.cs489.lab11.dto.address.AddressRequest;

public record PatientRequest(String id,
        String firstName,
        String lastName,
        String phoneNumber,
        String email,
        LocalDate dateOfBirth,
        AddressRequest address) {

}
