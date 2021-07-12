package github.lukasmolin.ufjf.modelagem.atividade6.entidade.impressao.ArquivoImpressao;

import java.util.List;

public class Arquivo {
    private String nomeDoArquivo;
    private List<ArquivoImpressao> impressoes;

    public String getNomeDoArquivo() {
        return nomeDoArquivo;
    }

    public void setNomeDoArquivo(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public List<ArquivoImpressao> getImpressoes() {
        return impressoes;
    }

    public void setImpressoes(List<ArquivoImpressao> impressoes) {
        this.impressoes = impressoes;
    }
}
