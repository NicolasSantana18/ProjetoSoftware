import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {

        //Entrada de Dados
        Scanner sc = new Scanner(System.in);

        Carro citroen = new Carro();
        System.out.println("Digite o modelo do carro: ");
        citroen.modelo = sc.nextLine();
        sc.nextLine();
        System.out.println("Digite o marca do carro: ");
        citroen.marca = sc.nextLine();
        sc.nextLine();
        System.out.println("Digite o ano do carro: ");
        citroen.ano = sc.nextInt();

        Carro cruze = new Carro();
        cruze.modelo = "Cruze";
        cruze.marca = "Chevrolet";
        cruze.ano = 2019;


        citroen.exibirInformacoes();

    }

}
