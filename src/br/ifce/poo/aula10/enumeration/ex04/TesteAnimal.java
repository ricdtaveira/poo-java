package br.ifce.poo.aula10.enumeration.ex04;

public class TesteAnimal {

    public static void main (String args[]) {
        Animal x = new Animal();
        x.setCodigo("ANM-01");
        x.setNome("TOM");
        x.setTipoanimal(TipoAnimal.CAPRINO);
        x.falaAnimal();
    }
}
