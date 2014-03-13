/*
 * Este programa exemplifica o uso do comando while juntamente com
 * funcionalidades para criar e manipular strings
 */

package br.ifce.poo.etec.aula02;

/**
 *
 * @author ricardo.taveira
 */
public class Aula02Exemplo06 {

      public static void main(String[] args) {

        String copyFromMe = "Copie esa string ateh voce encontrar a letra 'g'.";
        StringBuffer copyToMe = new StringBuffer();

        int i = 0;
        // copia o caracter(simbolo ou letra) na posicao indicada pela
        // variavel i para a variavel c
        char c = copyFromMe.charAt(i);

        // enquanto valor da variavel c for diferente da constante 'g'
        // os comando do bloco serão repetidos
        while (c != 'g') {
            //acrescenta a variavel c à nova string
            copyToMe.append(c);
            // copia o caracter(simbolo ou letra) na posicao indicada pela
            // variavel i. Observar que o i antes de ser usado é incrementado
            c = copyFromMe.charAt(++i);
        }
        System.out.println(copyToMe);
    }
}


