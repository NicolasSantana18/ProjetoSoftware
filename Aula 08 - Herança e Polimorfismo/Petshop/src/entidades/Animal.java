package entidades;

public abstract class Animal {
    private String nome;
    private int idade;
    private double peso;


    //Constructor
    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public Animal(String nome) {
        this.nome = nome;
    }



    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "nome: " + nome +
                "| idade: " + idade +
                "| peso: " + peso;
    }
}
