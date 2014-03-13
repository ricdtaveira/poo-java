package br.ifce.poo.aula06.polimorfismo01;

public class TestInterface {
    
    public static void main ( String [] args ){
        
        Veiculo v1 = new Jipe();
        Veiculo v2 = new Jegue();
        Manobrista mano = new Manobrista();

        mano.estaciona(v1);
        mano.estaciona(v2);
    }
}
