package github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario;

import github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.Usuario;
import github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.setor.Setor;

public abstract class Funcionario extends Usuario {
    private Setor setor;
    protected Horario horario;

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

}
