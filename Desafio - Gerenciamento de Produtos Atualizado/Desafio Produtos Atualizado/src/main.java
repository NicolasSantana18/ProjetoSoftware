import Entidades.*;

import java.io.FileWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        GerenciarProdutos lista = new GerenciarProdutos();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n-----SISTEMA DE GERENCIAMENTO DE PRODUTOS------");
            System.out.println("1 - Cadastra de Produto Eletrônico");
            System.out.println("2 - Cadastro de Produto Vestuário");
            System.out.println("3 - Cadastro de Produto Alimentício");
            System.out.println("4 - Listar Produto");
            System.out.println("5 - Atualizar Produto");
            System.out.println("6 - Remover Produto");
            System.out.println("7 - Sair");
            System.out.println("Digite a opção desejada: ");
            String opcao = sc.nextLine();


            switch (opcao) {
                case "1" -> {
                    System.out.println("Digite o nome do produto Eletrônico: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o preço do produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a garantia do produto: ");
                    int garantiaMeses = sc.nextInt();
                    sc.nextLine();


                    ProdutoEletrônico produto = new ProdutoEletrônico(nome, preco, quantidade, garantiaMeses);

                    lista.cadastroProdutoEletronico(produto);

                }
                case "2" -> {
                    System.out.println("Digite o nome do produto Vestuário: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o preço do produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o tamanho do produto: ");
                    String tamanho = sc.nextLine();


                    ProdutoVestuário produto = new ProdutoVestuário(nome, preco, quantidade, tamanho);

                    lista.cadastroProdutoVestuário(produto);
                }

                case "3" -> {
                    System.out.println("Digite o nome do produto Alimentício: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o preço do produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a data de validade do produto: ");
                    String dataValidade = sc.nextLine();
                    sc.nextLine();


                    ProdutoAlimenticio produtoAlimentício = new ProdutoAlimenticio(nome, preco, quantidade, dataValidade);

                    lista.cadastroProdutoAlimentício(produtoAlimentício);
                }

                case "4" -> {
                    lista.listarProdutos();
                }

                case "5" -> {

                    System.out.println("Digite o tipo do produto: ");
                    int tipoProduto = sc.nextInt();

                    if (tipoProduto == 1){
                        lista.listarProdutos();

                        System.out.println("Digite o id do produto: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Digite o nome do produto: ");
                        String nome = sc.nextLine();

                        System.out.println("Digite o novo preço do produto: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Digite a nova quantidade do produto: ");
                        int quantidade = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Digite a nova Garantia do produto: ");
                        int garantiaMeses = sc.nextInt();

                        lista.atualizarProdutoEletrônico(id, nome, valor, quantidade, garantiaMeses);

                    } else if (tipoProduto == 2){
                        lista.listarProdutos();

                        System.out.println("Digite o id do produto: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Digite o nome do produto: ");
                        String nome = sc.nextLine();

                        System.out.println("Digite o novo preço do produto: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Digite a nova quantidade do produto: ");
                        int quantidade = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Digite o tamanho do produto: ");
                        String Tamanho = sc.nextLine();

                        lista.atualizarProdutoVestuário(id, nome, valor, quantidade, Tamanho);
                    } else if (tipoProduto == 3) {
                        lista.listarProdutos();

                        System.out.println("Digite o id do produto: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Digite o nome do produto: ");
                        String nome = sc.nextLine();

                        System.out.println("Digite o novo preço do produto: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Digite a nova quantidade do produto: ");
                        int quantidade = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Digite o tamanho do produto: ");
                        String DataValidade = sc.nextLine();

                        lista.atualizarProdutoAlimentício(id, nome, valor, quantidade, DataValidade);
                    } else {
                        System.out.println("Opção Inválida, Tente Novamente");
                    }
                }
                case "6" -> {
                    lista.listarProdutos();

                    System.out.println("Digite o id do produto que queira remover: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    lista.removerProduto(id);
                }

                case "7" -> {
                    System.out.println("Saindo do Programa");
                    break;
                }
            }
        }
    }

}
