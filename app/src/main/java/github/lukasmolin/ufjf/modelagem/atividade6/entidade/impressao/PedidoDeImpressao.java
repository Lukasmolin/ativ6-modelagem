package github.lukasmolin.ufjf.modelagem.atividade6.entidade.impressao;

import java.util.Date;
import java.util.List;

import github.lukasmolin.ufjf.modelagem.atividade6.entidade.impressao.ArquivoDeImpressao.ArquivoDeImpressao;

public class PedidoDeImpressao {
    private Date horaDoPedido;
    private Date horaDaEntrega;
    private int numeroDoPedido;
    private Pagamento pagamento;
    private StatusDoPedido status;
    private List<ArquivoDeImpressao> arquivosDoPedido;
    private ISolicitanteImpressao solicitante;
    private IResponsavelImpressao responsavel;

    public Date getHoraDoPedido() {
        return horaDoPedido;
    }

    public void setHoraDoPedido(Date horaDoPedido) {
        this.horaDoPedido = horaDoPedido;
    }

    public Date getHoraDaEntrega() {
        return horaDaEntrega;
    }

    public void setHoraDaEntrega(Date horaDaEntrega) {
        this.horaDaEntrega = horaDaEntrega;
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

    public List<ArquivoDeImpressao> getArquivosDoPedido() {
        return arquivosDoPedido;
    }

    public void setArquivosDoPedido(List<ArquivoDeImpressao> arquivosDoPedido) {
        this.arquivosDoPedido = arquivosDoPedido;
    }

    public ISolicitanteImpressao getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(ISolicitanteImpressao solicitante) {
        this.solicitante = solicitante;
    }

    public IResponsavelImpressao getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(IResponsavelImpressao responsavel) {
        this.responsavel = responsavel;
    }
}
