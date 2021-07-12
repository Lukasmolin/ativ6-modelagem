package github.lukasmolin.ufjf.modelagem.atividade6.entidade.impressao.ArquivoImpressao;

import github.lukasmolin.ufjf.modelagem.atividade6.entidade.impressao.PedidoImpressao;

public class ArquivoImpressao {
    private CorImpressao cor;
    private Arquivo arquivo;
    private int numCopias;
    private PedidoImpressao pedido;

    public CorImpressao getCor() {
        return cor;
    }

    public void setCor(CorImpressao cor) {
        this.cor = cor;
    }

    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }

    public PedidoImpressao getPedido() {
        return pedido;
    }

    public void setPedido(PedidoImpressao pedido) {
        this.pedido = pedido;
    }
}
