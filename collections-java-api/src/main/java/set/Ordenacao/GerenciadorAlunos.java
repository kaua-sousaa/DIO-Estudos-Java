package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Alunos(nome,matricula,media));

    }

    public void removerAluno(long matricula){

        if (!alunosSet.isEmpty()){
            for (Alunos al : alunosSet){
                if (al.getMatricula().equals(matricula)){
                    alunosSet.remove(al);
                    break;
                }
            }
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Alunos> alunoOrdemAlfabetica = new TreeSet<>(alunosSet);

        if (!alunosSet.isEmpty()){
            System.out.println(alunoOrdemAlfabetica);
        }else{
            System.out.println("Lista vazia");
        }
    }

    public void exibirAlunosPorNota(){
        Set <Alunos> alunosOrdemPorNota = new TreeSet<>(new comparatorPorNota());

        if(!alunosSet.isEmpty()){
            alunosOrdemPorNota.addAll(alunosSet);
            System.out.println(alunosOrdemPorNota);
        }else{
            System.out.println("Lista vazia");
        }

    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("CKaua", 85L, 8.5);
        gerenciadorAlunos.adicionarAluno("AGB", 95L, 3);
        gerenciadorAlunos.adicionarAluno("DLucas", 15L, 9);
        gerenciadorAlunos.adicionarAluno("EFelipe", 35L, 1.5);

        //gerenciadorAlunos.removerAluno(85L);
        //gerenciadorAlunos.exibirAlunosPorNota();
        gerenciadorAlunos.exibirAlunosPorNome();

        //gerenciadorAlunos.exibirAlunos();

    }
}
