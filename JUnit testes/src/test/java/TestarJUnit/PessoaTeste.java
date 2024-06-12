package TestarJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2008,1,1,15,1,1));
        Assertions.assertEquals(24, jessica.getIdade());

    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000,1,1,15,1,1));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("Jessica", LocalDateTime.of(2008,1,1,15,1,1));
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
