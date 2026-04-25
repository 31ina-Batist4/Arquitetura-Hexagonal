package com.elina.hexagonal.adapters.output;

import com.elina.hexagonal.adapters.output.client.FindAddressByZipCodeClient;
import com.elina.hexagonal.adapters.output.client.mapper.AddressResponseMapper;
import com.elina.hexagonal.application.core.domain.Address;
import com.elina.hexagonal.application.ports.output.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter  implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
