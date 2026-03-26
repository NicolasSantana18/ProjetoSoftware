package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um valor: ");
            double n1 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Digite outro valor: ");
            double n2 = sc.nextDouble();
            sc.nextLine();

            double resultado = n1 / n2;
            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Informe um valor numerico");
        }

        sc.close();

    }
}
