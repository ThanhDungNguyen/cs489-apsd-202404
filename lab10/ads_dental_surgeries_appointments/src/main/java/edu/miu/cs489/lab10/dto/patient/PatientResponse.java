package edu.miu.cs489.lab10.dto.patient;

import java.time.LocalDate;

import edu.miu.cs489.lab10.dto.address.AddressResponse;

public record PatientResponse(String id,
        String firstName,
        String lastName,
        String phoneNumber,
        String email,
        LocalDate dateOfBirth,
        AddressResponse address) {

}
