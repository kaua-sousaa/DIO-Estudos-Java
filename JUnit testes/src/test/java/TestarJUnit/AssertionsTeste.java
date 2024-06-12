package TestarJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsTeste {

    @Test
    void valirLancamento(){
        int[] primeiroLancamento = {1,2,3,5,5};
        int[] segundoLancamento = {1,2,3,4,5};

      //  Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);
        Pessoa luciano = new Pessoa("Luciano", LocalDateTime.now());

        Assertions.assertNull(luciano);
    }
}
