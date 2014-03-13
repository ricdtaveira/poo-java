

package br.ifce.poo.aula11.excecoes02;


public class TestaDivisao {


     public static void main (String args[]) {

        try {
         int x=10;
         System.out.println("10 dividido por 2=" + x/0);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro : "+e);
        }
        catch (ArithmeticException e) {
            System.out.println("Erro : " + e);
        }
      //  catch (Exception e) {
       //     System.out.println("Erro : " + e);
       // }
        System.out.println("fim do main");
}

}
