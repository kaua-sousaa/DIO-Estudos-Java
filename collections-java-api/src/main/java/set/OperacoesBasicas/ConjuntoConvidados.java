package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }

        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem: "+ conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("Convidado 1", 12345);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 12345);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 12346);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 12347);

        System.out.println("Existem: "+ conjuntoConvidados.contarConvidados());

    }
}
