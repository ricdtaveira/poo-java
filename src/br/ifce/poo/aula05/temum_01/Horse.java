/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifce.poo.aula05.temum_01;

/**
 *
 * @author ricardo.taveira
 */
public class Horse extends Animal {
   private Halter myHalter;

   public void tie(LeadRope rope) {
      myHalter.tie(rope);
      // Delegate tie behavior to the
                           // Halter object
   }
}

