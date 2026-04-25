package com.elina.hexagonal.adapters.output.repository.mapper;

import com.elina.hexagonal.adapters.output.repository.entity.CustomerEntity;
import com.elina.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
