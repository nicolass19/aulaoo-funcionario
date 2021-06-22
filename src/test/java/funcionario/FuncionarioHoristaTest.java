package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHoristaTest {

    @Test
    void deveRetornarNomeFuncionario() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setNome("Nicolas");
        assertEquals("Nicolas", funcionarioHorista.getNome());
    }

    @Test
    void deveCalcularSalario() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setGanhoFixo(1000.0f);
        funcionarioHorista.setValorHora(100.0f);
        funcionarioHorista.setNumHorasDia(8);
        funcionarioHorista.setNumDias(10);
        assertEquals(9000.0f, funcionarioHorista.calcularSalario());
    }

}