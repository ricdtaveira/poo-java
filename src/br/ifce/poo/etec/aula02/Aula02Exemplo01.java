/*
 * Este exemplo mostra os conceitos de definicao de variaveis em um metodo,
 * sentenças de atribuição, entrada e saída de dados.
 */

package br.ifce.poo.etec.aula02;

import java.util.Scanner; // programa usa a  classe Scanner



/**
 *
 * @author ricardo.taveira
 */
public class Aula02Exemplo01 {

    public static void main( String args[] )
    {
        // cria um objeto input do tipo Scanner para obter um valor da console
        Scanner input = new Scanner( System.in );

        int n1; // primeiro numero para adicionar
        int n2; // segunfo numero para adicionar
        int soma; // soma de n1 com n2

        System.out.print( "Entre o primeiro inteiro: " ); // prompt
        n1 = input.nextInt(); // ler primeiro numero

        System.out.print( "Entre o segundo inteiro: " ); // prompt
        n2 = input.nextInt(); // ler segundo numero

        soma = n1 + n2; // adiciona numeros

        System.out.printf( "A Soma eh %d\n", soma ); // mostra soma

     } // fim do método main


}
