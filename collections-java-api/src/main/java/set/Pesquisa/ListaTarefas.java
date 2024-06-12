package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet =new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean status){
        tarefaSet.add(new Tarefa(descricao, status));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;

        if(!tarefaSet.isEmpty()){
            for (Tarefa taf : tarefaSet){
                if (taf.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemover = taf;
                    break;
                }
            }
            tarefaSet.remove(tarefaRemover);
        }else{
            System.out.println("Lista vazia");
        }


    }

    public void exibirTarefas(){

        if (!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else{
            System.out.println("lista vazia");
        }

    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if (!tarefaSet.isEmpty()){
            for (Tarefa taf : tarefaSet){
                if (taf.isStatus()){
                    tarefasConcluidas.add(taf);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if (!tarefaSet.isEmpty()){
            for (Tarefa taf : tarefaSet){
                if (!taf.isStatus()){
                    tarefasPendentes.add(taf);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){

        if(!tarefaSet.isEmpty()){
            for (Tarefa taf : tarefaSet){
                if (taf.getDescricao().equalsIgnoreCase(descricao)){
                    taf.setStatus(true);
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao){

        if (!tarefaSet.isEmpty()){
            for (Tarefa taf : tarefaSet){
                if (taf.getDescricao().equalsIgnoreCase(descricao)){
                    taf.setStatus(false);
                }
            }
        }
    }

    public void limparListaTarefas(){

        if (tarefaSet.isEmpty()){
            System.out.println("Lista esta vazia");
        }else{
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("fazer comida", true);
        listaTarefas.adicionarTarefa("fazer comida", true);
        listaTarefas.adicionarTarefa("correr", true);
        listaTarefas.adicionarTarefa("voar", true);
        listaTarefas.adicionarTarefa("pular feito", false);

        listaTarefas.exibirTarefas();
      //  System.out.println(listaTarefas.contarTarefas());
      //  System.out.println(listaTarefas.contarTarefas());
      //  System.out.println(listaTarefas.obterTarefasConcluidas());
      //  System.out.println(listaTarefas.obterTarefasPendentes());
      //  listaTarefas.removerTarefa("correr");
        //listaTarefas.marcarTarefaConcluida("pular feito");
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
