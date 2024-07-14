package subsistema2;

import singleton.SingletonEager;

public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI(){
        super();
    }

    public static CepAPI getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Rio de janeiro";
    }

    public String recuperarEstado(String cep){
        return "RJ";
    }
}
