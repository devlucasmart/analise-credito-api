package com.devlucasmart.analisecreditoapi.service.strategy.impl;

import com.devlucasmart.analisecreditoapi.constantes.MensagemConstante;
import com.devlucasmart.analisecreditoapi.domain.Proposta;
import com.devlucasmart.analisecreditoapi.exception.StrategyException;
import com.devlucasmart.analisecreditoapi.service.strategy.CalculoPonto;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Random;

import static com.devlucasmart.analisecreditoapi.constantes.MensagemConstante.CLIENTE_NEGATIVADO;

@Order(1)
@Component
public class NomeNegativadoImpl implements CalculoPonto {
    @Override
    public int calcular(Proposta proposta) {
        if (nomeNegativado()) {
            throw new StrategyException(String.format(CLIENTE_NEGATIVADO, proposta.getUsuario().getNome()));
        }
        return 100;
    }

    private boolean nomeNegativado() {
        return new Random().nextBoolean();
    }
}
