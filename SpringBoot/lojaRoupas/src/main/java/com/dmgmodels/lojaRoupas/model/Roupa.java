package com.dmgmodels.lojaRoupas.model;


import com.dmgmodels.lojaRoupas.dto.DadosAtualizarRoupa;
import com.dmgmodels.lojaRoupas.dto.DadosCadastroRoupa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "roupa") //Nome da Tabela do MySQL
@Entity(name = "Roupa")//Classe utilizada
@Getter
@Setter
@AllArgsConstructor //Construtor com todos os atributos
@NoArgsConstructor

public class Roupa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeProduto;
    private String marcaProduto;
    @Enumerated(EnumType.STRING) //Pega os valores enumerados da classe TAMANHO Enum
    private Tamanho tamanho;
    private double preco;
    private int quantidade;

    public Roupa(DadosCadastroRoupa dados) {
        this.nomeProduto = dados.nomeProduto();
        this.marcaProduto = dados.marcaProduto();
        this.tamanho = dados.tamanho();
        this.preco = dados.preco();
        this.quantidade = dados.quantidade();
    }

    public void atualizarRoupa(DadosAtualizarRoupa novosDados) {
        this.nomeProduto = novosDados.nomeProduto();
        this.marcaProduto = novosDados.marcaProduto();
        this.tamanho = novosDados.tamanho();
        this.preco = novosDados.preco();
        this.quantidade = novosDados.quantidade();
    }
}
