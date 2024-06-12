package apps;

public class Facebook extends ServicoMensagem{

	@Override
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviar mensagem facebook");	
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("receber mensagem facebook");
		
	}
}
