package github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.setor;

import java.util.List;

public class Unidade {
    private String nomeDaUnidade;
    private List<Departamento> departamentos;

    public String getNomeDaUnidade() {
        return nomeDaUnidade;
    }

    public void setNomeDaUnidade(String nomeDaUnidade) {
        this.nomeDaUnidade = nomeDaUnidade;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

}
