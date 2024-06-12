package TestarJUnit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciar conexao");
    }

    public static void finalizarConexao(){
        LOGGER.info("finalizar Conexao");
    }

    public static void insereDADOS(Pessoa pessoa){
        LOGGER.info("Inseriu dados");
    }

    public static void removeDADOS(Pessoa pessoa){
        LOGGER.info("removeu dados");
    }
}
