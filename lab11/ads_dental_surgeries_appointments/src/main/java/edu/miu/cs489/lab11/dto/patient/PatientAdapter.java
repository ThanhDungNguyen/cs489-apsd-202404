package edu.miu.cs489.lab11.dto.patient;

import edu.miu.cs489.lab11.dto.address.AddressAdapter;
import edu.miu.cs489.lab11.model.Patient;

public class PatientAdapter {
    public static Patient getPatientFromPatientRequest(PatientRequest patientRequest) {
        var address = AddressAdapter.getAddressFromAddressRequest(patientRequest.address());
        return new Patient(patientRequest.id(), patientRequest.firstName(), patientRequest.lastName(),
                patientRequest.phoneNumber(),
                patientRequest.email(), patientRequest.dateOfBirth(), address);
    }

    public static PatientResponse getPatientResponseFromPatient(Patient patient) {
        var addressResponse = AddressAdapter.getAddressResponseFromAddress(patient.getAddress());
        return new PatientResponse(patient.getId(), patient.getFirstName(), patient.getLastName(),
                patient.getPhoneNumber(), patient.getEmail(), patient.getDateOfBirth(), addressResponse);
    }

    public static PatientResponse getPatientResponseWithoutAddressFromPatient(Patient patient) {
        return new PatientResponse(patient.getId(), patient.getFirstName(), patient.getLastName(),
                patient.getPhoneNumber(), patient.getEmail(), patient.getDateOfBirth(), null);
    }
}
