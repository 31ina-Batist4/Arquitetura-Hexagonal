package com.elina.hexagonal.config;

import com.elina.hexagonal.adapters.output.FindAddressByZipCodeAdapter;
import com.elina.hexagonal.adapters.output.InsertCustomerAdapter;
import com.elina.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            InsertCustomerAdapter insertCustomerAdapter,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter
    ) {
        return new InsertCustomerUseCase(
                findAddressByZipCodeAdapter,
                insertCustomerAdapter);
    }
}
