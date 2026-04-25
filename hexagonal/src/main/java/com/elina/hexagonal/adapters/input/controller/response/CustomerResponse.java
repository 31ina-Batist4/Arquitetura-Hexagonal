package com.elina.hexagonal.adapters.input.controller.response;

import com.elina.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private AddressResponse address;

    private String cpf;

    private Boolean isValidCpf;
}
