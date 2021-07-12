package github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.aluno;

public class Curso {
    private String nomeDoCurso;
    private Aluno[] alunos;

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }
}
