
package br.ifce.poo.aula12.assertion;


public class Teste {

     public static void main (String args[]) {

         int x=10;
         int y=20;

         assert(x>y):"y é " + y + " x é " + x;

         switch (x) {
             case 1:
                 y = 3;
             case 2:
                 y = 9;
             case 3:
                 y = 27;
             default:
                 assert true;
         } // We're never supposed to get here!


}
}
