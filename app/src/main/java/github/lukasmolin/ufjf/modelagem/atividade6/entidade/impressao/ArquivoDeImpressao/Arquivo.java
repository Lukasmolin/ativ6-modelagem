package github.lukasmolin.ufjf.modelagem.atividade6.entidade.impressao.ArquivoDeImpressao;

import java.util.List;

public class Arquivo {
    private String nomeDoArquivo;
    private List<ArquivoDeImpressao> impressoes;

    public String getNomeDoArquivo() {
        return nomeDoArquivo;
    }

    public void setNomeDoArquivo(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public List<ArquivoDeImpressao> getImpressoes() {
        return impressoes;
    }

    public void setImpressoes(List<ArquivoDeImpressao> impressoes) {
        this.impressoes = impressoes;
    }
}
