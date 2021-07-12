package github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.professor;

import java.util.List;

public class Materia {
    private String nomeDaMateria;
    private List<Disciplina> disciplinas;

    public String getNomeDaMateria() {
        return nomeDaMateria;
    }

    public void setNomeDaMateria(String nomeDaMateria) {
        this.nomeDaMateria = nomeDaMateria;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
