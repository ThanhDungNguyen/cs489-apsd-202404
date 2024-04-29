package edu.miu.cs489.lab11.dto.address;

import edu.miu.cs489.lab11.dto.patient.PatientResponse;

public record AddressResponseWithPatient(String street,
        String city,
        String state,
        String zipCode,
        PatientResponse patient) {

}
