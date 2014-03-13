/*
 * Este programa exemplifica o uso do comando for juntamente com
 * funcionalidades para criar e manipular vetores
 */

package br.ifce.poo.etec.aula02;

/**
 *
 * @author ricardo.taveira
 */
public class Aula02Exemplo08 {

    public static void main(String[] args) {

        // Define um vetor(array de uma dimensão) de inteiros
        int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };

        // Sequencia de execução do for:
        // 1) Declara e inicaliza uma varaivel de controle
        // 2) Testa o valor da variavel de controle;
        //    se o teste for verdadeiro faz:
        //       - executa o bloco de comandos do for;
        //       - altera a variavel de controle.
        //    se o teste for falso termina o comando for
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.print(arrayOfInts[i] + " ");
        }
        System.out.println();
    }
}


