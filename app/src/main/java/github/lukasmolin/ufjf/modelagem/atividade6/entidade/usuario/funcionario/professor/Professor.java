package github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.professor;

import github.lukasmolin.ufjf.modelagem.atividade6.entidade.impressao.ISolicitanteImpressao;
import github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.Funcionario;
import github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.Horario;

public class Professor extends Funcionario implements ISolicitanteImpressao {
    private static int maxNumCopiasGratis = 200;
    private int numCopiasUsadas;

    public Horario getHorarioAtendimento() {
        return super.horario;
    }

    public void setHorarioAtendimento(Horario horario) {
        super.horario = horario;
    }

    public int getMaxNumCopiasGratis() {
        return maxNumCopiasGratis;
    }

    public static void setMaxNumCopiasGratis(int maxNumCopiasGratis) {
        Professor.maxNumCopiasGratis = maxNumCopiasGratis;
    }

    public int getNumCopiasUsadas() {
        return numCopiasUsadas;
    }

    public void setNumCopiasUsadas(int numCopiasUsadas) {
        this.numCopiasUsadas = numCopiasUsadas;
    }
}
