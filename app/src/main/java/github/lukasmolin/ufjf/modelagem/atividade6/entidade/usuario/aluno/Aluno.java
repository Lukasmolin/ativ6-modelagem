package github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.aluno;

import github.lukasmolin.ufjf.modelagem.atividade6.entidade.impressao.ISolicitanteImpressao;
import github.lukasmolin.ufjf.modelagem.atividade6.entidade.usuario.Usuario;

public class Aluno extends Usuario implements ISolicitanteImpressao {
    private static int maxNumCopias;
    private int numCopiasUsadas;
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getMaxNumCopiasGratis() {
        return maxNumCopias;
    }

    public static void setMaxNumCopiasGratis(int maxNumCopias) {
        Aluno.maxNumCopias = maxNumCopias;
    }

    public int getNumCopiasUsadas() {
        return numCopiasUsadas;
    }

    public void setNumCopiasUsadas(int numCopiasUsadas) {
        this.numCopiasUsadas = numCopiasUsadas;
    }
}
