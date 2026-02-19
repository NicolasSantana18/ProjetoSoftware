public class Main {
    public  static void main(String[] args) {

        Livro harryPotter = new Livro("Harry Potter e a Pedra Filosofal", "J.K Rowling", 500, 69.90);


        Livro senhorDosAneis = new Livro(" O Senhor dos Anéis", "J.R.R. Tolkien", 10, 89.90); //"new Livro()" é o construtor, que serve para não deixar os valores nulos


        harryPotter.emprestaLivro(11);
        harryPotter.exibirInformacoes();



        harryPotter.devolveLivro(10);
        harryPotter.valorTotal();
        harryPotter.exibirInformacoes();

    }
}
