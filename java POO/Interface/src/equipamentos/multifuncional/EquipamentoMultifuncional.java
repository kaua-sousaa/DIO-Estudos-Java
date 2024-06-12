package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("imprimindo via multifuncional");
	}

	@Override
	public void digitalizar() {
		// TODO Auto-generated method stub
		System.out.println("digitalizando via multifuncional");
	}

	@Override
	public void copiar() {
		System.out.println("Copiando via multifuncional");
	}
	
}
