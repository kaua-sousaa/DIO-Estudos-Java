package main.java.Lista.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaEncontrada = new ArrayList<>();
        if(!livros.isEmpty()){
            for (Livro l : livros){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    listaEncontrada.add(l);
                }
            }
        }
        return listaEncontrada;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaEncontrada = new ArrayList<>();

        if(!livros.isEmpty()){
            for (Livro l :livros){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){

                    listaEncontrada.add(l);
                }
            }
        }

        return listaEncontrada;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroEncontrado = null;

        if(!livros.isEmpty()){
            for (Livro l : livros){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroEncontrado =  l;
                    break;
                }
            }
        }
        return livroEncontrado;
    }


    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivro("rei e rainhas", "pedro", 2003);
        livros.adicionarLivro("princesas e princepes", "pedro", 2003);
        livros.adicionarLivro("farofeiros", "gb", 2010);
        livros.adicionarLivro("tropa do urso", "abelha", 2023);
        //System.out.println(livros.pesquisarPorAutor("pedro"));
        //System.out.println(livros.pesquisarPorIntervaloAnos(2005, 2025));
        System.out.println(livros.pesquisarPorTitulo("rei e rainhas"));
    }
}
