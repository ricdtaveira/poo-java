/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifce.poo.aula04.heranca_02;

/**
 *
 * @author ricardo.taveira
 */
public class TestShapes {

     public static void main (String[] args) {
      PlayerPiece player = new PlayerPiece();
      TilePiece   tile   = new TilePiece();
      doShapes(player);
      doShapes(tile);
   }

     public static void doShapes(GameShape shape) {
     shape.displayShape();
   }



}
