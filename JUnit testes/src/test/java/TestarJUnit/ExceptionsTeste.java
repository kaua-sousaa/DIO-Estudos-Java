package TestarJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
         Conta contaOrigem = new Conta("12345", 0);
         Conta contaDestino = new Conta("123456", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, ()->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino,2));
    }
}
