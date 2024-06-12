package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatoSet.add(new Contato(nome,telefone));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();

        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;

    }

    public Contato atualizarNumeroContato(String nome, int novoTelefone){
        Contato contatoAtualizado = null;

        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 1234);
        agendaContatos.adicionarContato("Camila", 556);
        agendaContatos.adicionarContato("Camila Cavalcante", 556);
        agendaContatos.adicionarContato("Camila DIO", 412416);
        agendaContatos.adicionarContato("Marina", 511111);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
    }
}
