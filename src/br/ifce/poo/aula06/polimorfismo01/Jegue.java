package br.ifce.poo.aula06.polimorfismo01;

public class Jegue implements Veiculo {

    public void freia() {
        System.out.println("Jegue freia");
    }

    public void acelera() {
       System.out.println("Jegue acelera");
    }

    public void vira(String direcao) {
        System.out.println("Jegue vira para "+ direcao);
    }

}
