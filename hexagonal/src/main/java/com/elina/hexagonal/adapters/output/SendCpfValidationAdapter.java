package com.elina.hexagonal.adapters.output;

import com.elina.hexagonal.application.ports.output.SendCpfValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfValidationAdapter implements SendCpfValidationOutputPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String cpf) {
       kafkaTemplate.send("tp-cpf-validation",cpf );
    }
}
