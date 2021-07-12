package github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.professor;

import java.util.List;

public class SemestreAcademico {
    private int ano;
    private byte semestre;
    private List<Disciplina> disciplinasMinistradas;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    public List<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(List<Disciplina> disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }
}
