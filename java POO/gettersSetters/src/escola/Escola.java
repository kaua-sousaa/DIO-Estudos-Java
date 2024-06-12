package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setIdade(19);
		felipe.setNome("Joserrr");
		felipe.setSexo("Masculino");
		
		System.out.println("O aluno "+ felipe.getNome()+", possui "+ felipe.getIdade()+" anos de idade"
				+ " e é do sexo "+ felipe.getSexo());
	}
}
