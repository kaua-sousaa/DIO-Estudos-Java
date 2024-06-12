package main.java.Lista.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> carrinho;

    public CarrinhoDeCompra() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensRemover = new ArrayList<>();
        for (Item t: carrinho) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                itensRemover.add(t);
            }
        }
        carrinho.removeAll(itensRemover);
    }

    public double calculaValorTotal(){
        double total = 0;
        for (Item t: carrinho){
            total += t.getQuantidade() * t.getPreco();
        }

        return total;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        carrinho.adicionarItem("boneco", 50.00, 2);
        carrinho.adicionarItem("carro", 100.99, 1);
        carrinho.adicionarItem("max steel", 100.99, 3);
        carrinho.adicionarItem("boneco", 100.99, 3);
        carrinho.removerItem("boneco");
        System.out.println(carrinho.calculaValorTotal());
        carrinho.exibirItens();
    }
}
