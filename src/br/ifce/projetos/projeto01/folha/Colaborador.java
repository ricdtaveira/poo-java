package br.ifce.projetos.projeto01.folha;

import java.math.BigDecimal;
import java.util.List;

public class Colaborador {
    private String                codigo;
    private String                nome;
    private String                endereco;
    private String                bairro;
    private String                cep;
    private BigDecimal            salario;
    private List<OcorrenciaFolha> ocorrencias;
}
