/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifce.poo.aula08.listaerro;

import java.util.ArrayList;

/**
 *
 * @author ricardo.taveira
 */
public class TesteGalinheiro {

     public static void main ( String [] args ){

         Galinheiro g = new Galinheiro(new ArrayList());
         g.add(new Galinha("Frida"));
         //g.add(new Raposa("Max"));
         Galinha frida = g.get(0);
         frida.ciscar();
     }

}
