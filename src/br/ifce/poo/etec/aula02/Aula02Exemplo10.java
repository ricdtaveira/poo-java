/*
 * Este programa mostra 
 *
 */

package br.ifce.poo.etec.aula02;

/**
 *
 * @author ricardo.taveira
 */
public class Aula02Exemplo10 {

    public static void main(String[] args) {

        // Chama um método estático público
        // Para usar um método estatico não é necessário criar um
        // objeto para a classe que ele pertence.
        Auxiliar.mostraMensagem();

        int a = Auxiliar.somar(10, 20);
        
        System.out.println("Soma=" + a);


    }

}
