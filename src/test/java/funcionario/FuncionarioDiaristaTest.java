package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioDiaristaTest {

    @Test
    void deveRetornarNomeFuncionario() {
        FuncionarioDiarista funcionarioDiarista = new FuncionarioDiarista();
        funcionarioDiarista.setNome("Nicolas");
        assertEquals("Nicolas", funcionarioDiarista.getNome());
    }

    @Test
    void deveCalcularSalario() {
        FuncionarioDiarista funcionarioDiarista = new FuncionarioDiarista();
        funcionarioDiarista.setValorDia(300.0f);
        assertEquals(300.0f, funcionarioDiarista.calcularSalario());
    }
}