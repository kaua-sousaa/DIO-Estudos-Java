package construtores;

public class SistemaCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa marcos = new Pessoa("111.222.333-44", "marcos");
		marcos.setEndereco("Rua das flores");
		
		System.out.println("nome: "+ marcos.getNome()+ " - cpf: " + marcos.getCpf());
	}

}
