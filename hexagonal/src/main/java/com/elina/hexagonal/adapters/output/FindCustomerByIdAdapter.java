package com.elina.hexagonal.adapters.output;

import com.elina.hexagonal.adapters.output.repository.CustomerRepository;
import com.elina.hexagonal.adapters.output.repository.mapper.CustomerEntityMapper;
import com.elina.hexagonal.application.core.domain.Customer;
import com.elina.hexagonal.application.ports.output.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity
                .map(entity ->
                                customerEntityMapper.toCustomer(entity));
    }
}
