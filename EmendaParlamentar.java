import java.util.ArrayList;
import java.util.List;

public class EmendaParlamentar {

    private int anoEmenda;
    private String tipoEmenda;
    private String nomeAutor;
    private String numeroEmenda;
    private String codigoEmenda;
    private boolean possuiApoio;
    private String apoiadorSolicitante;
    private boolean possuiConvenio;
    private String numeroConvenio;
    private String funcao;
    private String subfuncao;
    private String programaOrcamentario;
    private String acaoOrcamentaria;
    private String planoOrcamentario;
    private double valorEmpenhado;
    private double valorLiquidado;
    private double valorPago;
    private String localidadeGasto;
    private double valorRestosPagarInscritos;
    private double valorRestosPagarCancelados;
    private double valorRestosPagarPagos;


    private List<DocumentoRelacionado> documentos = new ArrayList<>();

    public EmendaParlamentar(int anoEmenda, String tipoEmenda, String nomeAutor, String numeroEmenda,
        String codigoEmenda, boolean possuiApoio, String apoiadorSolicitante,
        boolean possuiConvenio, String numeroConvenio, String funcao, String subfuncao,
        String programaOrcamentario, String acaoOrcamentaria, String planoOrcamentario,
        double valorEmpenhado, double valorLiquidado, double valorPago, String localidadeGasto,
        double valorRestosPagarInscritos, double valorRestosPagarCancelados,
        double valorRestosPagarPagos
        ) {
        this.anoEmenda = anoEmenda;
        this.tipoEmenda = tipoEmenda;
        this.nomeAutor = nomeAutor;
        this.numeroEmenda = numeroEmenda;
        this.codigoEmenda = codigoEmenda;
        this.possuiApoio = possuiApoio;
        this.apoiadorSolicitante = apoiadorSolicitante;
        this.possuiConvenio = possuiConvenio;
        this.numeroConvenio = numeroConvenio;
        this.funcao = funcao;
        this.subfuncao = subfuncao;
        this.programaOrcamentario = programaOrcamentario;
        this.acaoOrcamentaria = acaoOrcamentaria;
        this.planoOrcamentario = planoOrcamentario;
        this.valorEmpenhado = valorEmpenhado;
        this.valorLiquidado = valorLiquidado;
        this.valorPago = valorPago;
        this.localidadeGasto = localidadeGasto;
        this.valorRestosPagarInscritos = valorRestosPagarInscritos;
        this.valorRestosPagarCancelados = valorRestosPagarCancelados;
        this.valorRestosPagarPagos = valorRestosPagarPagos;
    }

    public int getAnoEmenda() { return anoEmenda; }
    public void setAnoEmenda(int anoEmenda) { this.anoEmenda = anoEmenda; }

    public String getTipoEmenda() { return tipoEmenda; }
    public void setTipoEmenda(String tipoEmenda) { this.tipoEmenda = tipoEmenda; }

    public String getNomeAutor() { return nomeAutor; }
    public void setNomeAutor(String nomeAutor) { this.nomeAutor = nomeAutor; }

    public String getNumeroEmenda() { return numeroEmenda; }
    public void setNumeroEmenda(String numeroEmenda) { this.numeroEmenda = numeroEmenda; }

    public String getCodigoEmenda() { return codigoEmenda; }
    public void setCodigoEmenda(String codigoEmenda) { this.codigoEmenda = codigoEmenda; }

    public boolean isPossuiApoio() { return possuiApoio; }
    public void setPossuiApoio(boolean possuiApoio) { this.possuiApoio = possuiApoio; }

    public String getApoiadorSolicitante() { return apoiadorSolicitante; }
    public void setApoiadorSolicitante(String apoiadorSolicitante) { this.apoiadorSolicitante = apoiadorSolicitante; }

    public boolean isPossuiConvenio() { return possuiConvenio; }
    public void setPossuiConvenio(boolean possuiConvenio) { this.possuiConvenio = possuiConvenio; }

    public String getNumeroConvenio() { return numeroConvenio; }
    public void setNumeroConvenio(String numeroConvenio) { this.numeroConvenio = numeroConvenio; }

    public String getFuncao() { return funcao; }
    public void setFuncao(String funcao) { this.funcao = funcao; }

    public String getSubfuncao() { return subfuncao; }
    public void setSubfuncao(String subfuncao) { this.subfuncao = subfuncao; }

    public String getProgramaOrcamentario() { return programaOrcamentario; }
    public void setProgramaOrcamentario(String programaOrcamentario) { this.programaOrcamentario = programaOrcamentario; }

    public String getAcaoOrcamentaria() { return acaoOrcamentaria; }
    public void setAcaoOrcamentaria(String acaoOrcamentaria) { this.acaoOrcamentaria = acaoOrcamentaria; }

    public String getPlanoOrcamentario() { return planoOrcamentario; }
    public void setPlanoOrcamentario(String planoOrcamentario) { this.planoOrcamentario = planoOrcamentario; }

    public double getValorEmpenhado() { return valorEmpenhado; }
    public void setValorEmpenhado(double valorEmpenhado) { this.valorEmpenhado = valorEmpenhado; }

    public double getValorLiquidado() { return valorLiquidado; }
    public void setValorLiquidado(double valorLiquidado) { this.valorLiquidado = valorLiquidado; }

    public double getValorPago() { return valorPago; }
    public void setValorPago(double valorPago) { this.valorPago = valorPago; }

    public String getLocalidadeGasto() { return localidadeGasto; }
    public void setLocalidadeGasto(String localidadeGasto) { this.localidadeGasto = localidadeGasto; }

    public double getValorRestosPagarInscritos() { return valorRestosPagarInscritos; }
    public void setValorRestosPagarInscritos(double valorRestosPagarInscritos) { this.valorRestosPagarInscritos = valorRestosPagarInscritos; }

    public double getValorRestosPagarCancelados() { return valorRestosPagarCancelados; }
    public void setValorRestosPagarCancelados(double valorRestosPagarCancelados) { this.valorRestosPagarCancelados = valorRestosPagarCancelados; }

    public double getValorRestosPagarPagos() { return valorRestosPagarPagos; }
    public void setValorRestosPagarPagos(double valorRestosPagarPagos) { this.valorRestosPagarPagos = valorRestosPagarPagos; }

    public void addDocumento(DocumentoRelacionado doc) {
        documentos.add(doc);
    }

    public List<DocumentoRelacionado> getDocumentos() {
        return documentos;
    }

    public double calcularTotalPorFase(String fase) {
        double total = 0;
        for (DocumentoRelacionado doc : documentos) {
            if (doc.getFase().equalsIgnoreCase(fase)) {
                total += doc.getValor();
            }
        }
        return total;
    }
}

class DocumentoRelacionado {
    private String fase;
    private double valor;

    public DocumentoRelacionado(String fase, double valor) {
        this.fase = fase;
        this.valor = valor;
    }

    public String getFase() { return fase; }
    public double getValor() { return valor; }
}
