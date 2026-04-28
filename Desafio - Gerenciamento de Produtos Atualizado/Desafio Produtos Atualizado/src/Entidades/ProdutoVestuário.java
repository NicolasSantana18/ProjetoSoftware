package Entidades;

public class ProdutoVestuário extends Produto {
    private String tamanho;

    public ProdutoVestuário(String nome, double preco, int quantidade, String tamanho) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
    }


    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return " Produto Vestuário " + super.toString()
                + "Tamanho: " + tamanho + "|";
    }
}
