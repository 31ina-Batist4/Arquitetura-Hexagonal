package com.elina.hexagonal.adapters.output.client.mapper;

import com.elina.hexagonal.adapters.output.client.response.AddressResponse;
import com.elina.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
