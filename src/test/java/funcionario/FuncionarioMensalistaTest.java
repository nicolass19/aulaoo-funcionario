package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioMensalistaTest {

    @Test
    void deveRetornarNomeFuncionario() {
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista();
        funcionarioMensalista.setNome("Nicolas");
        assertEquals("Nicolas", funcionarioMensalista.getNome());
    }

    @Test
    void deveCalcularSalario() {
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista();
        funcionarioMensalista.setValorMes(50000.0f);
        assertEquals(50000.0f, funcionarioMensalista.calcularSalario());
    }
}