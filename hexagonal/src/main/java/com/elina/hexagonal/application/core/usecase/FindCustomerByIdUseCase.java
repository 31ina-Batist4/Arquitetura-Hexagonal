package com.elina.hexagonal.application.core.usecase;

import com.elina.hexagonal.application.core.domain.Customer;
import com.elina.hexagonal.application.ports.input.FindCustomerByIdInputPort;
import com.elina.hexagonal.application.ports.output.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private FindCustomerByIdOutputPort findCustomerByIdOutputPort;

        public FindCustomerByIdUseCase(
                FindCustomerByIdOutputPort findCustomerByIdOutputPort
        ) {
            this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
        }

    @Override
    public Customer find (String id) {
        return findCustomerByIdOutputPort
                .find(id)
                .orElseThrow(() ->
                        new RuntimeException("Customer not found"));
    }
}
