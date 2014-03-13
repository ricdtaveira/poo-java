package br.ifce.poo.aula06.polimorfismo01;

public class Onibus implements Veiculo {
    public void freia() {
        System.out.println("Onibus freia");
    }

    public void acelera() {
       System.out.println("Onibus acelera");
    }

    public void vira(String direcao) {
        System.out.println("Onibus vira para "+ direcao);
    }
}
