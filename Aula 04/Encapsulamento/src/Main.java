import entidades.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Oswaldo", 6000);

        conta.setTitular("Cleiton rs");

        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());
    }
}
