package OperadorLogico;

public class Operacoes {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2){
            System.out.println("As duas condicoes sao verdadeiras");
        }
        System.out.println("fim");

        if (condicao1 || condicao2){
            System.out.println("uma das condicoes sao verdadeiras");
        }

    }
}
