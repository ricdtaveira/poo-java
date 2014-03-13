package br.ifce.poo.aula08.listaerro;

import java.util.ArrayList;
import java.util.List;

public class Teste {

      public static void main ( String [] args ){

          List galinheiro = new ArrayList();
          galinheiro.add(new Galinha("Chocagilda"));
          galinheiro.add(new Galinha("Cocotalva"));
          galinheiro.add(new Raposa("Galius"));
          for (int i = 0; i < galinheiro.size(); i++) {
              Galinha g = (Galinha) galinheiro.get(i);
          g.ciscar();
}
      }

}
