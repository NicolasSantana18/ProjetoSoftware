package com.dmgmodels.lojaRoupas.dto;

import com.dmgmodels.lojaRoupas.model.Tamanho;

public record DadosAtualizarRoupa(
        Long id,
        String nomeProduto,
        String marcaProduto,
        Tamanho tamanho,
        double  preco,
        int quantidade
) {
}
