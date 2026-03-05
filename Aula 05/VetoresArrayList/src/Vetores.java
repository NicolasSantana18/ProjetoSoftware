public class Vetores {
    public static void main(String[] args) {

        double[] ListaNumeros = new double[10];

        ListaNumeros[0] = 1;
        ListaNumeros[1] = 2;
        ListaNumeros[2] = 3;
        ListaNumeros[3] = 4;
        ListaNumeros[4] = 5;
        ListaNumeros[5] = 6;
        ListaNumeros[6] = 7;
        ListaNumeros[7] = 8;
        ListaNumeros[8] = 9;
        ListaNumeros[9] = 10;

        //Percorrer Vetores em Java
        //Tradicional - for
        for (int i = 0; i < ListaNumeros.length; i++) {
            System.out.println(ListaNumeros[i]);
        }

        //ForEach
        for (double num : ListaNumeros) {
            System.out.println(num);
        }
    }
}
