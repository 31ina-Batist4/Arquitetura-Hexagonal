package com.elina.hexagonal.application.core.usecase;

import com.elina.hexagonal.application.core.domain.Customer;
import com.elina.hexagonal.application.ports.input.InsertCustomerInputPort;
import com.elina.hexagonal.application.ports.output.FindAddressByZipCodeOutputPort;
import com.elina.hexagonal.application.ports.output.InsertCustomerOutputPort;
import com.elina.hexagonal.application.ports.output.SendCpfValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private InsertCustomerOutputPort insertCustomerOutputPort;

    private SendCpfValidationOutputPort sendCpfValidationOutputPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort,
            SendCpfValidationOutputPort sendCpfValidationOutputPort
    ) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert (Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfValidationOutputPort.send(customer.getCpf());
    }

}
