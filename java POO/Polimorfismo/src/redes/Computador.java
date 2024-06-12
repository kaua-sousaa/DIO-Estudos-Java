package redes;

import apps.Facebook;
import apps.ServicoMensagem;
import apps.Telegram;

public class Computador {

	public static void main(String[] args) {
		ServicoMensagem smi = null;
		
		String appEscolhido = "telegram";
		
		if (appEscolhido.equals("facebook")) {
			smi = new Facebook();
		}else if (appEscolhido.equals("telegram")) {
			smi = new Telegram();
		}
		
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}

}
