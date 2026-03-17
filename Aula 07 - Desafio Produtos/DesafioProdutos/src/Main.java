import Entidades.GerenciarProdutos;
import Entidades.Roupa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciarProdutos lista = new GerenciarProdutos();

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\n-----SISTEMA DE GERENCIAMENTO DE PRODUTOS------");
            System.out.println("1 - Cadastra de Produto");
            System.out.println("2 - Listar Produto");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("5 - Sair");
            System.out.println("Digite a opção desejada: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1" -> {
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o valor do produto: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    Roupa produto = new Roupa(nome, quantidade, valor);

                    lista.cadastroProduto(produto);
                }


                case "2" -> {
                    lista.listarProdutos();
                }


                case "3" -> {
                    lista.listarProdutos();

                    System.out.println("Digite o id do produto: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o novo valor do produto: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a nova quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    lista.atualizarProduto(id, nome, valor, quantidade);
                }


                case "4" -> {

                    lista.listarProdutos();

                    System.out.println("Digite o id do produto: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    lista.removerProduto(id);

                }

                case "5" -> {
                    System.out.println("Saindo do Programa");
                    return;
                }
            }


        }




    }
}
