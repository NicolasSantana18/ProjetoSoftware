import java.util.ArrayList;

public class ListaNomes {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("Pedro");
        listaNomes.add("Maria");
        listaNomes.add("Rodrigo");
        listaNomes.add("Antonio");
        listaNomes.add("Juanito");
        listaNomes.add("Maria");

        //Função Anonima
        //Remove valores iguais a Maria
        listaNomes.removeIf(nome -> nome.equals("Maria"));

        //Remover a partir de um valor
        listaNomes.removeIf(nome -> nome.contains("r"));

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}
