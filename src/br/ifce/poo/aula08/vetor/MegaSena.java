
package br.ifce.poo.aula08.vetor;

public class MegaSena {

    public static int[] getDezenas() {
         int[] dezenas = new int[6];
         for (int i = 0; i < dezenas.length; i++) {
             dezenas[i] = (int) Math.ceil((Math.random()*60));
         }
         return dezenas;
     }

    public static void printDezenas(int [] dezenas) {

         for (int i=0; i < dezenas.length; i++) {

             System.out.println(dezenas[i]);
        }
    }

}
