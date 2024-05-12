package com.devlucasmart.analisecreditoapi.service.strategy.impl;

import com.devlucasmart.analisecreditoapi.domain.Proposta;
import com.devlucasmart.analisecreditoapi.service.strategy.CalculoPonto;
import org.springframework.stereotype.Component;

@Component
public class PrazoPagamentoInferiorDezAnos implements CalculoPonto {
    @Override
    public int calcular(Proposta proposta) {
        return proposta.getPrazoPagamento() <= 120 ? 80 : 0;
    }
}
