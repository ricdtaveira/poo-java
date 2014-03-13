/*
 * Este programa exemplifica o uso do comando continue juntamente com
 * funcionalidades para criar e manipular strings
 */

package br.ifce.poo.etec.aula02;

/**
 *
 * @author ricardo.taveira
 */
public class Aula02Exemplo09 {

    public static void main(String[] args) {

        StringBuffer searchMe = new StringBuffer("o rato roeu a roupa da rainha de roma");
        // atrubue a variavel max o tamanho de caracteres da string searchMe
        int max = searchMe.length();
        int numRs = 0;


        for (int i = 0; i < max; i++) {
	    //procura os r's
            if (searchMe.charAt(i) != 'r')
                // o continue desvia para o final do for.
                // salta as intruções que processam os r´s
	        continue;

	    //processa os r´s
	    numRs++;
            searchMe.setCharAt(i, 'R');
        }
        System.out.println("Encontrado " + numRs + " r's na string.");
        System.out.println(searchMe);
    }


}
