package Entidades;

import java.util.ArrayList;

public class GerenciarProdutos {

        private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void cadastroProdutoEletronico(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("Produto Cadastrado");
    }

    public void cadastroProdutoVestuário(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("Produto Cadastrado");
    }

    public void cadastroProdutoAlimentício(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("Produto Cadastrado");
    }


    public void listarProdutos(){
        if (listaProdutos.isEmpty()){
            System.out.println("Nenhum produto encontrado");
        } else {
            System.out.println("\nID | NOME | PREÇO | QUANTIDADE | VALOR EM ESTOQUE | DESCRIÇÃO");
            for (int i=0; i< listaProdutos.size(); i++){
                System.out.println( i + " | " + listaProdutos.get(i).toString());
            }
        }
    }


    public void atualizarProdutoEletrônico(int id, String nome,double preco, int quantidade, int garantiaMeses){

        ProdutoEletrônico produto = (ProdutoEletrônico) listaProdutos.get(id);

        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
        produto.setGarantia(garantiaMeses);

        System.out.println("Produto atualizado");

    }

    public void atualizarProdutoVestuário(int id, String nome,double preco, int quantidade, String tamanho){

        ProdutoVestuário produto = (ProdutoVestuário) listaProdutos.get(id);

        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
        produto.setTamanho(tamanho);

        System.out.println("Produto atualizado");

    }

    public void atualizarProdutoAlimentício(int id, String nome,double preco, int quantidade, String DataValidade){

        ProdutoAlimenticio produto = (ProdutoAlimenticio) listaProdutos.get(id);

        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
        produto.setDataValidade(DataValidade);

        System.out.println("Produto atualizado");

    }





    public void removerProduto(int id){

        Produto produto = listaProdutos.get(id);
        listaProdutos.remove(id);
        System.out.println("Produto removido");
    }

}