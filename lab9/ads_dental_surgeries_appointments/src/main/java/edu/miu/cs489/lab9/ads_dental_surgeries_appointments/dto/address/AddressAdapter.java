package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.address;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.patient.PatientAdapter;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.dto.patient.PatientResponse;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model.Address;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model.Patient;

public class AddressAdapter {
    public static Address getAddressFromAddressRequest(AddressRequest addressRequest) {
        return addressRequest == null ? null
                : new Address(null, addressRequest.street(), addressRequest.city(), addressRequest.state(),
                        addressRequest.zipCode(), null);
    }

    public static AddressResponse getAddressResponseFromAddress(Address address) {
        return address == null ? null
                : new AddressResponse(address.getStreet(), address.getCity(), address.getState(), address.getZipCode());
    }

    public static AddressResponseWithPatient getAddressResponseWithPatientFromAddress(Address address) {
        Patient patient = address.getPatient();
        PatientResponse patientResponse = PatientAdapter.getPatientResponseWithoutAddressFromPatient(patient);
        return new AddressResponseWithPatient(address.getStreet(), address.getCity(), address.getState(),
                address.getZipCode(), patientResponse);
    }
}
