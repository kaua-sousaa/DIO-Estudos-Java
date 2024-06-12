package TestarJUnit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoasTest {

    @BeforeAll
    static  void configurarConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDADOS(new Pessoa("Joao", LocalDateTime.of(2000, 1, 1, 1,1 ,1)));
    }

    @Test
    void validarDadosRetorno(){
        Assertions.assertTrue(true);
    }
    @Test
    void validarDadosRetorno2(){
        Assertions.assertTrue(true);
    }

    @AfterEach
    void removerDadosDoTeste(){
        BancoDeDados.removeDADOS(new Pessoa("Joao", LocalDateTime.of(2000, 1, 1, 1,1 ,1)));
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
