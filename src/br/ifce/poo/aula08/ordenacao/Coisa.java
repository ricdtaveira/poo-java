package br.ifce.poo.aula08.ordenacao;

public class Coisa implements Comparable {

    int id;

    public Coisa(int id) {
        this.id = id;
    }

    public int compareTo(Object obj) {
        Coisa outro = (Coisa) obj;
        int retorno=0;
        if (id > outro.id) {
            retorno=1;
        }
        if (id < outro.id) {
            retorno = -1;
        }
        if (id == outro.id) {
            retorno=0;
        }
        return retorno;
    }

    public int imprime () {

        return id;
    }


}
