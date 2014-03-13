/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifce.poo.aula09.lista;
import  br.ifce.poo.aula08.iterator.Coisa;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author ricardo.taveira
 */
public class TesteLista {


    public static void main(String[] args) {


        List lista = new ArrayList();

        lista.add(new Coisa("um"));
        lista.add(new Coisa("dois"));
        lista.add(new Coisa("tres"));

        Coisa c3 = (Coisa) lista.get(2); // == índice de vetor
        ListIterator it = lista.listIterator();
        Coisa d = (Coisa) it.previous();
        Coisa[] coisas = (Coisa[]) lista.toArray(new Coisa[lista.size()]);

    }
}
