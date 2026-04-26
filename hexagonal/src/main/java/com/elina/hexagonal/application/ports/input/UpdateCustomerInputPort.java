package com.elina.hexagonal.application.ports.input;

import com.elina.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

        void update(Customer customer, String zipCode);
}
