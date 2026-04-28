package Entidades;

public class ProdutoEletrônico extends Produto {
    private int garantiaMeses;

    public ProdutoEletrônico(String nome, double preco, int quantidade, int garantiaMeses) {
        super(nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

  

    @Override
    public String toString() {
        return " Produto Eletrônico " + super.toString()
                + "descricao: " + garantiaMeses + "|";
    }

    public void setGarantia(int garantiaMeses) {
    }
}
