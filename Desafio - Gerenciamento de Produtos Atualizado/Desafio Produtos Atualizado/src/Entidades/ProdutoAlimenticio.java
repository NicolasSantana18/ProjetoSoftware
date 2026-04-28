package Entidades;

import java.util.Date;

public class ProdutoAlimenticio extends Produto{
        private String dataValidade;


    public ProdutoAlimenticio(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }


    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return " Produto Alimenticio " + super.toString()
        + " | Data de Validade: " + dataValidade + "|";
    }
}
