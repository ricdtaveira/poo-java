package br.ifce.poo.aula08.vetor;

import java.util.Arrays;

public class Teste {


     public static void main ( String [] args ){

       int[] dezenas = new int[6];

       dezenas = MegaSena.getDezenas();
       System.out.println("Palpite Gerado");
       MegaSena.printDezenas(dezenas);
       System.out.println("Palpite Ordenado");
       Arrays.sort(dezenas);       
       MegaSena.printDezenas(dezenas);
     }

}
