package Entidades;

import java.util.ArrayList;

public class GerenciarProdutos {

    private ArrayList<Roupa> listaProdutos = new ArrayList<>();


    public void cadastroProduto(Roupa roupa){
        listaProdutos.add(roupa);
        System.out.println("Produto Cadastrado");
    }


    public void listarProdutos(){
        if (listaProdutos.isEmpty()){
            System.out.println("Nenhum produto encontrado");
        } else {
            System.out.println("\nID | NOME | PREÇO | QUANTIDADE | VALOR EM ESTOQUE");
            for (int i=0; i< listaProdutos.size(); i++){
                System.out.println( i + " | " + listaProdutos.get(i));
            }
        }
    }


    public void atualizarProduto(int id, String nome,double valor, int quantidade){

        Roupa roupa = listaProdutos.get(id);

        roupa.setNome(nome);
        roupa.setQuantidade(quantidade);
        roupa.setValor(valor);

        System.out.println("Produto atualizado");

    }


    public void removerProduto(int id){

        Roupa roupa = listaProdutos.get(id);
        listaProdutos.remove(id);
        System.out.println("Produto removido");
    }


}
