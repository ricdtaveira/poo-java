package br.ifce.poo.aula04.heranca_01;

import br.ifce.poo.aula04.heranca_01.PlayerPiece;

public class TestShapes {

    public static void main (String[] args) {
      PlayerPiece shape = new PlayerPiece();
      shape.displayShape();
      shape.movePiece();
      System.out.println(shape.toString());
   }
}
