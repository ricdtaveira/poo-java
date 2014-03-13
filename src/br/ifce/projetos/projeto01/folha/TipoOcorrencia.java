package br.ifce.projetos.projeto01.folha;

public enum TipoOcorrencia {

    P("PROVENTO"), // Provento
    D("DESCONTO");  // Desconto

    private final String tipoOcorrencia;

    private TipoOcorrencia(String tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public String getTipoProvento() {
        return tipoOcorrencia;
    }

}
