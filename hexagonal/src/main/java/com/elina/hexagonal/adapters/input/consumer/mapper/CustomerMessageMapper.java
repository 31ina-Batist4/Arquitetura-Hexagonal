package com.elina.hexagonal.adapters.input.consumer.mapper;

import com.elina.hexagonal.adapters.input.consumer.message.CustomerMessage;
import com.elina.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "zipCode",  ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
