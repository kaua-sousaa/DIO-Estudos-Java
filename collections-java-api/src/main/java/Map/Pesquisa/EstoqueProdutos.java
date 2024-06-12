package main.java.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirTodosOsProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double CalcularValorTotalEstoque(){
        double valorTotal = 0;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto prod : estoqueProdutosMap.values()){
                valorTotal += prod.getPreco() * prod.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutosMap.isEmpty()){
            for(Produto prod : estoqueProdutosMap.values()){
                if (prod.getPreco() > maiorPreco){
                maiorPreco = prod.getPreco();
                produtoMaisCaro = prod;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto 1", 10, 5d);
        estoqueProdutos.adicionarProduto(2L, "Produto 2", 5, 10d);
        estoqueProdutos.adicionarProduto(3L, "Produto 3", 2, 15d);

        estoqueProdutos.exibirTodosOsProdutos();
        System.out.println("Valor total: R$ " + estoqueProdutos.CalcularValorTotalEstoque());
        System.out.println("Produto mais caro: "+ estoqueProdutos.obterProdutoMaisCaro());
    }
}
