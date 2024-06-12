package aa;

public class Carro extends Veiculo{
	
	public void ligar() {
		confereCombustivel();
		confereCambio();
		System.out.println("Ligando");
	}
	
	private void confereCambio() {
		System.out.println("Conferindo cambio");
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combustivel");
	}
}
