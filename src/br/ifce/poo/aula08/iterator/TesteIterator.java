/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifce.poo.aula08.iterator;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author ricardo.taveira
 */
public class TesteIterator {

    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("um", new Coisa("um"));
        map.put("dois", new Coisa("dois"));
        map.put("tres", new Coisa("tres"));

        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Coisa c = (Coisa) it.next();
            System.out.println(c.nomeCoisa());
        }

    }
}
