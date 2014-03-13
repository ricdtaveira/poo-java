/*
 * Este exemplo mostra a utilização de operadores relacionais
 * 
 */

package br.ifce.poo.etec.aula02;

/**
 *
 * @author ricardo.taveira
 */
public class Aula02Exemplo03 {
    public static void main(String[] args) {

        //Exemplso de números
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("Valor das variaveis...");
        System.out.println("    i = " + i);
        System.out.println("    j = " + j);
        System.out.println("    k = " + k);

        //maior do que
        System.out.println("Maior do que...");
        System.out.println("    i > j = " + (i > j)); //false
        System.out.println("    j > i = " + (j > i)); //true
        System.out.println("    k > j = " + (k > j)); //false;
                                                      //they are equal

        //Maior do que ou igual a
        System.out.println("Maior do que ou igual a...");
        System.out.println("    i >= j = " + (i >= j)); //false
        System.out.println("    j >= i = " + (j >= i)); //true
        System.out.println("    k >= j = " + (k >= j)); //true

        //Menor do que
        System.out.println("Menor do que...");
        System.out.println("    i < j = " + (i < j)); //true
        System.out.println("    j < i = " + (j < i)); //false
        System.out.println("    k < j = " + (k < j)); //false

        //Menor do que ou igual a
        System.out.println("Menor do que ou igual a...");
        System.out.println("    i <= j = " + (i <= j)); //true
        System.out.println("    j <= i = " + (j <= i)); //false
        System.out.println("    k <= j = " + (k <= j)); //true

        //Igual a
        System.out.println("Igual a...");
        System.out.println("    i == j = " + (i == j)); //false
        System.out.println("    k == j = " + (k == j)); //true

        //Diferente
        System.out.println("Diferente ..");
        System.out.println("    i != j = " + (i != j)); //true
        System.out.println("    k != j = " + (k != j)); //false
    }
}
