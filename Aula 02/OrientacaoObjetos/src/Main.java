public class Main {
    public static void main(String[] args) {

        Lanche xEgg = new Lanche();
        xEgg.nome = "X-Egg";
        xEgg.preco = 24.90;
        xEgg.descricao = "Pão, Maionese, Ovo, Hambúrguer, Queijo";



        Lanche x_Umc = new Lanche();
        x_Umc.nome = "X-UMC";
        x_Umc.preco = 54.90;
        x_Umc.descricao = "Pão amantegado na chapa, 2 fatias de bacon, 2 Hambúrgueres Alface, Queijo Qualho, Mel ";




        xEgg.exibir(); //Métdp
        x_Umc.exibir();

        //Nome - Null
        //Preço - 0
        //Descricão = Null
    }
}
