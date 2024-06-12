package TestarJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

//    @Test
//    void validarAlgoSomenteNoUsuarioWillyan(){
//        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
//        Assertions.assertEquals(10, 5 + 5);
//    }

    @Test
   // @DisabledIfEnvironmentVariable(named="USER", matches = "root")
    @EnabledOnOs(OS.WINDOWS)
    void validarTeste(){
        Assertions.assertEquals(10, 5 + 5);
    }


}
