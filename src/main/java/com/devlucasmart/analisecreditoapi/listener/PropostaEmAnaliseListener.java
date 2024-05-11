package com.devlucasmart.analisecreditoapi.listener;

import com.devlucasmart.analisecreditoapi.domain.Proposta;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropostaEmAnaliseListener {
    @RabbitListener(queues = "proposta-pendente.ms-analise-credito")
    public void propostaEmAnalise(Proposta proposta){

    }
}
