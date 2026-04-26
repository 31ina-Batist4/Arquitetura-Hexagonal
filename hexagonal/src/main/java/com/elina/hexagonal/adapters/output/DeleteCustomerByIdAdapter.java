package com.elina.hexagonal.adapters.output;

import com.elina.hexagonal.adapters.output.repository.CustomerRepository;
import com.elina.hexagonal.application.ports.output.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
