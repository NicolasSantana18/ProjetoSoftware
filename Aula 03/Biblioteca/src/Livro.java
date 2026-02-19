public class Livro {
    String titulo;
    String autor;
    int Quantidade;
    double valorLivro;


    //Construtor
    public Livro(String titulo, String autor, int Quantidade, double valorLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.Quantidade = Quantidade;
        this.valorLivro = valorLivro;

    }

    //Metodo empresta livro
    public void emprestaLivro(int Quantidade){
        if (Quantidade > 0 && Quantidade <= this.Quantidade){
            this.Quantidade -= Quantidade;
        } else {
            System.out.println("Informe uma quantidade válida");}
    }


    //Metodo valor total
    public double valorTotal(){
        return this.valorLivro * this.Quantidade;
    }



    //Metodo Devolve livro
    public void devolveLivro(int Quantidade){
        if (Quantidade > 0 && Quantidade <= this.Quantidade){
            this.Quantidade += Quantidade;
            System.out.println("\nLivro devolvido com sucesso");
        } else {
            System.out.println("Informe a quantidade válida");
        }
    }


    //Métodos para exibir informações do livro
    public void exibirInformacoes(){
        System.out.printf("\nTitulo: " + this.titulo +
                " \nAutor: " + this.autor +
                " \nQuantidade: " + this.Quantidade +
                " \nValor do Livro: R$" + this.valorLivro +
                "\nValor Total: R$" + "%.2f" , valorTotal()
        );
    }
}
