package com.devlucasmart.analisecreditoapi.listener;

import com.devlucasmart.analisecreditoapi.domain.Proposta;
import com.devlucasmart.analisecreditoapi.service.AnaliseCreditoService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropostaEmAnaliseListener {

    private final AnaliseCreditoService analiseCreditoService;

    public PropostaEmAnaliseListener(AnaliseCreditoService analiseCreditoService) {
        this.analiseCreditoService = analiseCreditoService;
    }

    @RabbitListener(queues = "${rabbitmq.queue.proposta.pendente}")
    public void propostaEmAnalise(Proposta proposta){
        analiseCreditoService.analisar(proposta);
    }
}
