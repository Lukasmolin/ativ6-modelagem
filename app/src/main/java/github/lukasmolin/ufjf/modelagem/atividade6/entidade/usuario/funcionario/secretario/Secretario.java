package github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.secretario;

import github.lukasmolin.ufjf.modelagem.atividade6.entidade.impressao.IResponsavelImpressao;
import github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.Funcionario;
import github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.Horario;

public class Secretario extends Funcionario implements IResponsavelImpressao {

    public Horario getHorarioTrabalho() {
        return super.horario;
    }

    public void setHorarioTrabalho(Horario horario) {
        super.horario = horario;
    }

}
