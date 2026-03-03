import entidades.Lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lanche x_UMC = new Lanche("X-UMC",
        "Pão, Hamburguer, Queijo, Maionese.",
        40, 10);


        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n------LISTA DE OPÇÕES------");
            System.out.println("1 - FAZER PEDIDO");
            System.out.println("2 - ADICIONAR AO ESTOQUE");
            System.out.println("3 - INFORMAÇÃO DO LANCHE");
            System.out.println("4 - ALTERAR VALOR");
            System.out.println("5 - ALTERAR DESCRIÇÃO");
            System.out.println("6 - SAIR");
            System.out.println("DIGITE A OPÇÃO DESEJADA: ");
            String opcao = sc.nextLine();

            switch (opcao) {

                case "1":
                    System.out.print("Quantos lanches você deseja?: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();


                    if (x_UMC.decrementaEstoque(quantidade)) {
                        System.out.println("\nVocê pediu " + quantidade +
                                " " + x_UMC.getNome() + " e o valor total, foi de R$ " +
                                x_UMC.valorTotal(quantidade));
                    } else {
                        System.out.println("\nPedido não realizado!");
                        System.out.println("\nQuantidade Inválida");
                    }
                    break;


                case "2":
                    System.out.println("Quantos lanches deseja adicionar ao estoque?: ");
                    int quantidadeEstoque = sc.nextInt();
                    sc.nextLine();


                    x_UMC.incrementaEstoque(quantidadeEstoque);
                    break;


                case "3":
                    System.out.println(x_UMC.toString());
                    break;

                case "4":
                    System.out.println("O lanche " + x_UMC.getNome() +
                    " custa R$" + x_UMC.getValor());

                    System.out.println("Informe o valor do lanche: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    x_UMC.setValor(valor);
                    break;
                default:
                    System.out.println("Informe uma opção válida");

                case "5":
                    System.out.println("O lanche " + x_UMC.getNome() +
                    " possui: " + x_UMC.getDescricao());
                    System.out.println("\nInforme a nova descrição do lanche: ");
                    String descricao = sc.nextLine();

                    x_UMC.setDescricao(descricao);
                    break;

            }

        }


        
    }


}
