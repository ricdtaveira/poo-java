package br.ifce.poo.aula08.ordenacao;

import java.util.Arrays;

public class Teste {

    public static void main ( String [] args ){
        Coisa c1 = new Coisa(123);
        Coisa c2 = new Coisa(456);
        if (c1.compareTo(c2)!=0) System.out.println("São diferentes");
        Coisa coisas[] = {c2, c1, new Coisa(3)};
        System.out.println("Vetor criado");
        printCoisas(coisas);
        
        Arrays.sort(coisas);
        System.out.println("Vetor ordenado");
        printCoisas(coisas);
    }
    
    public static void printCoisas(Coisa bucado[]) {
        
        for (int i=0; i < bucado.length; i++) {
             System.out.println(bucado[i].imprime());    
        
        }

    }

}
