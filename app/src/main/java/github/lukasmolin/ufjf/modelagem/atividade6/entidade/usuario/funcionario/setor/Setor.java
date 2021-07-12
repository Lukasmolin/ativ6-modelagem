package github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.setor;

import java.util.List;

import github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.Funcionario;

public class Setor {
    private Departamento departamento;
    private String nomeSetor;
    private List<Funcionario> funcionariosDoSetor;

    public List<Funcionario> getFuncionariosDoSetor() {
        return funcionariosDoSetor;
    }

    public void setFuncionariosDoSetor(List<Funcionario> funcionariosDoSetor) {
        this.funcionariosDoSetor = funcionariosDoSetor;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

}
