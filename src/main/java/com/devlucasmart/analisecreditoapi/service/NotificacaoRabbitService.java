package com.devlucasmart.analisecreditoapi.service;

import com.devlucasmart.analisecreditoapi.domain.Proposta;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoRabbitService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void notificar(String exchange, Proposta proposta) {
        rabbitTemplate.convertAndSend(exchange, "", proposta);
    }
}
