package com.elina.hexagonal.config;

import com.elina.hexagonal.adapters.output.DeleteCustomerByIdAdapter;
import com.elina.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.elina.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter

    ) {
        return new DeleteCustomerByIdUseCase(
                findCustomerByIdUseCase,
                deleteCustomerByIdAdapter
        );
    }
}
