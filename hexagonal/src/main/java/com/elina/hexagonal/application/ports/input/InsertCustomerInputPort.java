package com.elina.hexagonal.application.ports.input;

import com.elina.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
