package entidades;

public class Gato extends Animal {
    private String cor;


    //Construtor
    public Gato(String nome, double peso, int idade, String cor) {
        super(nome, idade, peso);
        this.cor = cor;
    }


    public Gato(String nome, String cor) {
        super(nome);
        this.cor = cor;
    }

    //Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato " + super.toString() +
                "| cor: " + cor;
    }
}
