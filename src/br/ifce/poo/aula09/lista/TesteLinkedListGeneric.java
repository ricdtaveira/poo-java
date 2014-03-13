/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifce.poo.aula09.lista;

import java.util.LinkedList;
import java.util.List;
import br.ifce.poo.aula08.iterator.Coisa;

/**
 *
 * @author ricardo.taveira
 */
public class TesteLinkedListGeneric {

    public static void main ( String [] args ){

         List<Coisa> coisas = new LinkedList<Coisa>();

         coisas.add(new Coisa("Um"));
         coisas.add(new Coisa("Dois"));
         coisas.add(new Coisa("Tres"));
         coisas.add(new Coisa("Quatro"));

         System.out.println("Primeira Listagem");
         for (Coisa elemento : coisas){

             System.out.println(elemento.nomeCoisa());

         }

         coisas.add(0, new Coisa("Seis"));
         coisas.add(new Coisa("Sete"));

         System.out.println("Segunda Listagem");

         for (Coisa elemento : coisas){

             System.out.println(elemento.nomeCoisa());

         }

         coisas.remove(0);
         System.out.println("Terceira Listagem");

         for (Coisa elemento : coisas){

             System.out.println(elemento.nomeCoisa());

         }



    }

}
