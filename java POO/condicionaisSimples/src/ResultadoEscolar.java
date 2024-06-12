public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;
     
        if (nota>= 7){
            System.out.println("Aprovado");
        }else if(nota>=5 && nota <7){
            System.out.println("Prova recuperação");
        }else{
            System.out.println("Reprovado");
        }

        
        //operador ternario
        String resultado = nota>=7 ? "Aprovado" : nota >=5 && nota <=7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
