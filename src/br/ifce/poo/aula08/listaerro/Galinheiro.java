package br.ifce.poo.aula08.listaerro;

import java.util.List;

public class Galinheiro {

    private List galinhas;

    public Galinheiro(List list) {
           galinhas = list;
    }
    public Galinha get(int idx) {

        return (Galinha) galinhas.get(idx);
    }
    public void add(Galinha g) {
        galinhas.add(g);

    }

}
