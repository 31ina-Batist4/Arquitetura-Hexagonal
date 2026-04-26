package com.elina.hexagonal.application.ports.output;

import com.elina.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert (Customer customer);
}
