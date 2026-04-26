package com.elina.hexagonal.config;

import com.elina.hexagonal.adapters.output.FindAddressByZipCodeAdapter;
import com.elina.hexagonal.adapters.output.UpdateCustomerAdapter;
import com.elina.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.elina.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(
                findCustomerByIdUseCase,
                findAddressByZipCodeAdapter,
                updateCustomerAdapter
        );
    }

}
