
public class Computador {

	public static void main(String[] args) {
		System.out.println("FACEBOOK");
		Facebook fcb = new Facebook();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("Telegram");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}

}
