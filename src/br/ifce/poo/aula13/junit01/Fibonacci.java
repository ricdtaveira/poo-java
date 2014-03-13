
package br.ifce.poo.aula13.junit01;


public class Fibonacci {

    public int calcularFibo(int x){

        if (x==0)
            return 0;
        else
        if (x==1)
            return 1;
        else
            return calcularFibo(x-1)+x;
    }

}
