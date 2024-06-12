package operadoresRelacionais;

public class Operacoes {
    public static void main(String[] args) {
        String nomeUm = "Gleyson";
        String nomeDois = new String("Gleyson");

        System.out.println(nomeUm==nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero1 eh igual ao numero2?"+simNao);

        simNao = numero1 !=numero2;

        System.out.println("Numero1 eh diferente ao numero2?"+simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 eh maior q numero2?"+simNao);


    }
}
