package br.ifce.exercicio.exercicio01;

public class Casa extends Construcao {

    private Pessoa proprietario;
    private int numero;

    public Casa(String finalidade, Pessoa proprietario, int numero) {
        super(finalidade);
        this.proprietario = proprietario;
        this.numero = numero;
    }




}
