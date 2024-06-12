package aa;

public class Autodromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro jeep = new Carro();
		jeep.setChassi("Aaa");
		jeep.ligar();
		System.out.println("Chassi: "+ jeep.getChassi());
		
		Moto cb1000 = new Moto();
		cb1000.ligar();
		
	}

}
