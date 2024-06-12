import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.next();

        System.out.println("Digite o nome do cliente: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo: ");
        Double saldo = sc.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta "+numeroConta+ " e seu saldo "+ saldo+" já está disponível para saque.");

        sc.close();
    }
}
