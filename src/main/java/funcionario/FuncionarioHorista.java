package funcionario;

public class FuncionarioHorista extends Funcionario {

    private float valorHora;
    private int numDias;
    private int numHorasDia;

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public int getNumHorasDia() {
        return numHorasDia;
    }

    public void setNumHorasDia(int numHorasDia) {
        this.numHorasDia = numHorasDia;
    }

    public float calcularSalario(){

        this.valorHora = this.numDias * this.numHorasDia * this.valorHora;
        return  this.valorHora + this.getGanhoFixo();
    }
}
