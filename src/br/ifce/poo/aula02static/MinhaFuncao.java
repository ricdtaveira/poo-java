/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifce.poo.aula02static;

/**
 *
 * @author ricardo.taveira
 */
public class MinhaFuncao {
    
    public static int pares (int x) {
        
        int soma=0;
        
        for (int y=0; y <= x; y=y+2) {
            soma = soma + y;
        }
        return soma;
    }
    
}
