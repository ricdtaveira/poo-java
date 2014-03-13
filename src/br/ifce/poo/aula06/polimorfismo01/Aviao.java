package br.ifce.poo.aula06.polimorfismo01;

public class Aviao implements Veiculo {
    public void freia() {
        System.out.println("Aviao freia");
    }

    public void acelera() {
       System.out.println("Aviao acelera");
    }

    public void vira(String direcao) {
        System.out.println("Aviao vira para "+ direcao);
    }

}
