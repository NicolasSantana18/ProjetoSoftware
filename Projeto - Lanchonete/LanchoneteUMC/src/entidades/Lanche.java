package entidades;

public class Lanche {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;
    private boolean disponivel;



    //Construtor
    public Lanche(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.disponivel = estoque > 0;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.isBlank()) {
            System.out.println("Informe uma descrição VÁLIDA");
        } else  {
            this.descricao = descricao;
        }
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            System.out.println("Informe um valor maior que zero\n");
        } else {
            this.valor = valor;
            System.out.println("Valor Alterado com sucesso!\n");
        }
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    //Metodo para verificar a disponibilidade do estoque
    private void verificaDisponivel() {
        this.disponivel = this.estoque > 0;
    }


    //Metodo do pedido
    public boolean decrementaEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
            this.verificaDisponivel();
            return true;
        } else {
            return false;
        }
    }

    //Calcula o valor total do pedido
    public double valorTotal(int quantidade) {
        return this.valor * quantidade;
    }


    public void incrementaEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque > 0) {
            this.estoque += quantidadeEstoque;
            this.verificaDisponivel();
            System.out.println(this.estoque + " lanches foram adicionados ao estoque!");
        } else {
            System.out.println("Valor Inválido");
        }
    }



    //toString
    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nDescrição: " + descricao +
                "\nValor: R$" + valor +
                "\nEstoque: " + estoque +
                "\nDisponível: " + disponivel;
    }
}
