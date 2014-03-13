package br.ifce.poo.aula13.junit01;

public class Fatorial {

    public int calcular(int x) {

        if (x==0)
           return 1;
        else
        if (x==1)
           return 1;
        else
            return calcular(x-1)*x;
    }

}
