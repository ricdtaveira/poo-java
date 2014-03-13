/*
 * Este programa exemplifica o uso do comando do-while juntamente com
 * funcionalidades para criar e manipular strings
 */

package br.ifce.poo.etec.aula02;

/**
 *
 * @author ricardo.taveira
 */
public class Aula02Exemplo07 {
    
      public static void main(String[] args) {

        String copyFromMe     = "Copie esa string ateh voce encontrar a letra 'g'.";
        StringBuffer copyToMe = new StringBuffer();

        int i = 0;

        // copia o caracter(simbolo ou letra) na posicao indicada pela
        // variavel i para a variavel c
        char c = copyFromMe.charAt(i);

        do {
             //acrescenta a variavel c à nova string
            copyToMe.append(c);
            // copia o caracter(simbolo ou letra) na posicao indicada pela
            // variavel i. Observar que o i antes de ser usado é incrementado
            c = copyFromMe.charAt(++i);
        } while (c != 'g');

        System.out.println(copyToMe);
    }


}
