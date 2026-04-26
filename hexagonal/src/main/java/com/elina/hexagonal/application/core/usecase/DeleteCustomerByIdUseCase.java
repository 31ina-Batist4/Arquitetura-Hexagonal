package com.elina.hexagonal.application.core.usecase;

import com.elina.hexagonal.application.ports.input.DeleteCustomerByIdInputPort;
import com.elina.hexagonal.application.ports.input.FindCustomerByIdInputPort;
import com.elina.hexagonal.application.ports.output.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort
    ) {
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }
}
