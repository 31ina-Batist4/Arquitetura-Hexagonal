package com.elina.hexagonal.adapters.output.repository;

import com.elina.hexagonal.adapters.output.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
