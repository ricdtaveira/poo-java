package br.ifce.projetos.projeto01.folha;

import java.math.BigDecimal;

public class OcorrenciaFolha {

    private Colaborador    colaborador;
    private String         descricao;
    private BigDecimal     valor;
    private TipoOcorrencia tipoOcorrencia;

    public OcorrenciaFolha(Colaborador colaborador, String descricao, BigDecimal valor, TipoOcorrencia tipoOcorrencia) {
        this.colaborador = colaborador;
        this.descricao = descricao;
        this.valor = valor;
        this.tipoOcorrencia = tipoOcorrencia;
    }

}
