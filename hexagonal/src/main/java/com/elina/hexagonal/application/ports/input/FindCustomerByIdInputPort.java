package com.elina.hexagonal.application.ports.input;

import com.elina.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
