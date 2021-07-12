package github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.funcionario.professor;

public class Disciplina {
    private Materia materia;
    private SemestreAcademico semestre;
    private Professor professor;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public SemestreAcademico getSemestre() {
        return semestre;
    }

    public void setSemestre(SemestreAcademico semestre) {
        this.semestre = semestre;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
