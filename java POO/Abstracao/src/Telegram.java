
public class Telegram extends ServicoMensagem{

	@Override
	public void enviarMensagem() {
		System.out.println("Enviar mensagem telegram");
		
	}
	
	@Override
	public void receberMensagem() {
		System.out.println("receber mensagem telegram");
	}
}
