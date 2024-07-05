package dio.web_api.handler;

public class CampoObrigatorioException extends BusinessException{
    public CampoObrigatorioException(String mensagem) {
        super("O campo %s é obrigatorio", mensagem);
    }
}
