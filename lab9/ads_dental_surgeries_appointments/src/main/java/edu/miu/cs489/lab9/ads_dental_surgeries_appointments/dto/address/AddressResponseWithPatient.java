package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.address;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.patient.PatientResponse;

public record AddressResponseWithPatient(String street,
        String city,
        String state,
        String zipCode,
        PatientResponse patient) {

}
