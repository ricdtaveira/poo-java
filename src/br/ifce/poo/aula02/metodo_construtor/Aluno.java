package br.ifce.poo.aula02.metodo_construtor;

import java.util.Date;

public class Aluno {
    private  int id;
    private int matricula;
    private Date dataNascimento;
    private String nome;
    private String endereco;

    public Aluno(int matricula, String nome, String endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
