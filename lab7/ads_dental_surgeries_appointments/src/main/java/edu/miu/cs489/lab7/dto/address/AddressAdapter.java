package edu.miu.cs489.lab7.dto.address;

import edu.miu.cs489.lab7.model.Address;

public class AddressAdapter {
    public static Address getAddressFromAddressRequest(AddressRequest addressRequest) {
        return addressRequest == null ? null
                : new Address(null, addressRequest.street(), addressRequest.city(), addressRequest.state(),
                        addressRequest.zipCode());
    }

    public static AddressResponse getAddressResponseFromAddress(Address address) {
        return address == null ? null
                : new AddressResponse(address.getStreet(), address.getCity(), address.getState(), address.getZipCode());
    }
}
