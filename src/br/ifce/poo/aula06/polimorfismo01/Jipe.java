package br.ifce.poo.aula06.polimorfismo01;

public class Jipe implements Veiculo {

    public void freia() {
        System.out.println("Jipe freia");
    }

    public void acelera() {
       System.out.println("Jipe acelera");
    }

    public void vira(String direcao) {
        System.out.println("Jipe vira para "+ direcao);
    }

}
