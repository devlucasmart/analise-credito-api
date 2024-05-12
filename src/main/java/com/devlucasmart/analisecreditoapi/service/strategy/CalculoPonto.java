package com.devlucasmart.analisecreditoapi.service.strategy;

import com.devlucasmart.analisecreditoapi.domain.Proposta;

public interface CalculoPonto {
    int calcular(Proposta proposta);
}
