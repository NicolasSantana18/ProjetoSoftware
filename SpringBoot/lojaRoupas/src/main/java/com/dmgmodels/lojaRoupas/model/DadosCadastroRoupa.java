package com.dmgmodels.lojaRoupas.model;

public record DadosCadastroRoupa(
        String nomeProduto,
        String marcaProduto,
        Tamanho tamanho,
        double preco,
        int quantidade
) {
}
