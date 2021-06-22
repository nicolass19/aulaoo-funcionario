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
        funcionarioDiarista.setGanhoFixo(50.0f);
        funcionarioDiarista.setValorDia(300.0f);
        funcionarioDiarista.setNumDias(30);
        assertEquals(9050.0f, funcionarioDiarista.calcularSalario());
    }
}