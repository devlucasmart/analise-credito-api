package com.devlucasmart.analisecreditoapi.service.strategy.impl;

import com.devlucasmart.analisecreditoapi.domain.Proposta;
import com.devlucasmart.analisecreditoapi.exception.StrategyException;
import com.devlucasmart.analisecreditoapi.service.strategy.CalculoPonto;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Random;

import static com.devlucasmart.analisecreditoapi.constantes.MensagemConstante.CLIENTE_NEGATIVADO;
import static com.devlucasmart.analisecreditoapi.constantes.MensagemConstante.PONTIACAO_SERASA_BAIXA;

@Order(2)
@Component
public class PontuacaoScoreImpl implements CalculoPonto {
    @Override
    public int calcular(Proposta proposta) {
        var score = score();

        if (score < 200) {
            throw new StrategyException(String.format(PONTIACAO_SERASA_BAIXA, proposta.getUsuario().getNome()));
        } else if (score <= 400) {
            return 150;
        } else if (score <= 600) {
            return 180;
        } else {
            return 220;
        }
    }

    private int score() {
        return new Random().nextInt(0, 1000);
    }
}
