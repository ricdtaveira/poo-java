/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifce.poo.aula06.polimorfismo01;

/**
 *
 * @author ricardo.taveira
 */
public class Manobrista {

    public void estaciona (Veiculo v){
        v.vira("Direita");
        v.vira("Esquerda");
        v.freia();
    }

}
