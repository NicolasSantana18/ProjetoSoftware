package Entidades;

public class Roupa {
    private String nome;
    private int quantidade;
    private Double valor;


    public Roupa(String nome, int quantidade, Double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }



    public double calcularTotal(int quantidade, Double valor){

        return quantidade * valor;
    }


    //Getters
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double getValor() {
        return valor;
    }


    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }



    @Override
    public String toString() {
        return  " Nome: " + nome + " |" +
                " Valor: " + valor + " |" +
                " Quantidade: " + quantidade + " |" +
                " R$" + calcularTotal(quantidade, valor) + " |";
    }
}


