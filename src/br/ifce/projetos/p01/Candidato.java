package br.ifce.projetos.p01;

import java.util.Date;

/**
 * @author ricardo.taveira
 * @version 1.0
 * @updated 22-set-2009 17:44:25
 */
public class Candidato {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private java.util.Set historicos;
    private Vaga vaga;

    public Candidato(){

    }

    public void finalize() throws Throwable {

    }

}