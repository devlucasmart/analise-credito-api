package com.devlucasmart.analisecreditoapi.service.strategy.impl;

import com.devlucasmart.analisecreditoapi.domain.Proposta;
import com.devlucasmart.analisecreditoapi.service.strategy.CalculoPonto;
import org.springframework.stereotype.Component;

@Component
public class RendaMaiorValorSolicitado implements CalculoPonto {
    @Override
    public int calcular(Proposta proposta) {
        return rendaMaiorValorSolicitado(proposta) ? 100 : 0;
    }

    private boolean rendaMaiorValorSolicitado(Proposta proposta) {
        return proposta.getUsuario().getRenda() > proposta.getValorSolicitado();
    }
}
