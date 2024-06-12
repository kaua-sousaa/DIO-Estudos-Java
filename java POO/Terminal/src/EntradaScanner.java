import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Qual seu sobrenome: ");
        String sobrenome = sc.next();
        System.out.println("Qual a sua altura: ");
        Double altura = sc.nextDouble();
        
        System.out.println("Qual sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Ola, me chamo "+ nome + " "+ sobrenome);
        System.out.println("Tenho "+ idade+ " anos");
        System.out.println("Minha altura é "+ altura);

        sc.close();
    }
}
1