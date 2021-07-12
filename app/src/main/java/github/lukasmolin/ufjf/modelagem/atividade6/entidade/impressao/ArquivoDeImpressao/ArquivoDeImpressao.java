package github.lukasmolin.ufjf.modelagem.atividade6.entidade.impressao.ArquivoDeImpressao;

import github.lukasmolin.ufjf.modelagem.atividade6.entidade.impressao.PedidoDeImpressao;

public class ArquivoDeImpressao {
    private CorDaImpressao cor;
    private Arquivo arquivo;
    private int numCopias;
    private PedidoDeImpressao pedido;

    public CorDaImpressao getCor() {
        return cor;
    }

    public void setCor(CorDaImpressao cor) {
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

    public PedidoDeImpressao getPedido() {
        return pedido;
    }

    public void setPedido(PedidoDeImpressao pedido) {
        this.pedido = pedido;
    }
}
