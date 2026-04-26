package com.elina.hexagonal.application.ports.output;

import com.elina.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
