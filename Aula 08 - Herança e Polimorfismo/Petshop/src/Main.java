import entidades.Cachorro;
import entidades.Gato;
import entidades.Peixe;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Max", 1, 2, "Pug");
        Gato gato = new Gato("Levi", 2, 4, "Marron");
        Peixe peixe = new Peixe("Peixe", 3, 0.005, "Betta");


        System.out.println(cachorro);
        System.out.println(gato);
        System.out.println(peixe);

    }
}
