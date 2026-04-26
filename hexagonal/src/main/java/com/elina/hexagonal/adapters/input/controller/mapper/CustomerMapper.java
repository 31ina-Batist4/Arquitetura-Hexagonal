package com.elina.hexagonal.adapters.input.controller.mapper;

import com.elina.hexagonal.adapters.input.controller.request.CustomerRequest;
import com.elina.hexagonal.adapters.input.controller.response.CustomerResponse;
import com.elina.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
