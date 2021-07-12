package github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.setor;

public class Departamento {
    private String nomeDoDepartamento;
    private Unidade unidadePertencente;

    public String getNomeDoDepartamento() {
        return nomeDoDepartamento;
    }

    public void setNomeDoDepartamento(String nomeDoDepartamento) {
        this.nomeDoDepartamento = nomeDoDepartamento;
    }

    public Unidade getUnidadePertencente() {
        return unidadePertencente;
    }

    public void setUnidadePertencente(Unidade unidadePertencente) {
        this.unidadePertencente = unidadePertencente;
    }

}
