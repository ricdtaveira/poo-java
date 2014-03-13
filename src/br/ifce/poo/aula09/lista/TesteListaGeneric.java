/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifce.poo.aula09.lista;

import br.ifce.poo.aula08.iterator.Coisa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricardo.taveira
 */
public class TesteListaGeneric {

     public static void main ( String [] args ){

         List<Coisa> coisas = new ArrayList<Coisa>();

         coisas.add(new Coisa("Um"));
         coisas.add(new Coisa("Dois"));
         coisas.add(new Coisa("Tres"));
         coisas.add(new Coisa("Quatro"));

         for (Coisa elemento : coisas){

             System.out.println(elemento.nomeCoisa());

         }



     }

}
