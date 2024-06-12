package apps;

public class Telegram extends ServicoMensagem{

	@Override
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviar mensagem telegram");
		
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("receber mensagem telegram");
	}
}
