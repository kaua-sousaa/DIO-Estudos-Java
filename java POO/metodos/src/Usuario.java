public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("canal atual: "+smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("canal atual: "+smartTv.canal);
        
        System.out.println("esta ligada ? "+smartTv.ligada);
        System.out.println("canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> esta ligada ? "+smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status -> esta ligada ? "+smartTv.ligada);

    }
}
