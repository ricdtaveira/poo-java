/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifce.poo.aula04.heranca_01;

/**
 *
 * @author ricardo.taveira
 */
public class Test {
    public static void main(String [] args) {
    Test t1 = new Test();
    Test t2 = new Test();
    if (!t1.equals(t2))
      System.out.println("Eles não são iguais!");
    if (t1 instanceof Object)
      System.out.println("t1 é uma instacia de Object");
    
    t2=t1;

    if (!t1.equals(t2))
      System.out.println("t1 e t2 não são iguais");
    else
      System.out.println("t1 e t2 são iguais");

    if (t1 instanceof Test)
      System.out.println("t1 é uma instancia de Test");

  }


    

}
