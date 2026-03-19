package entidades;

public class Peixe extends Animal {
    private String especie;


    //Constructor
    public Peixe(String nome, int idade, double peso, String especie) {
        super(nome, idade, peso);//Chama o construtor da classe pai
        this.especie = especie;
    }

    public Peixe(String nome, String especie) {
        super(nome);
        this.especie = especie;
    }

    //Getters e Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Peixe " + super.toString() +
                "| especie: " + especie;
    }
}
