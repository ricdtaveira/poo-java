package br.ifce.poo.aula01.encapsulamento;

public class Principal {

    public static void main (String args[]) {

        // Instanciando um objeto a da classe Carro por meio
        // de um método construtor sem parametros
        // A variavel a do tipo carro recebe o endereço de um objeto carro
        // retornado pelo comando new e aloca esse endereço na variavel a
        // O Objeto passa a ser acessado por meio da
        // referencia, que é o endereço do objeto alocado na memória.
        Carro a = new Carro();
        // Chamando metodos modificadores para alterar
        // atributos do objeto recem-criado, já que os atributos
        // não foram inicializados.
        a.setCor("Preto");
        a.setFabricante("Honda");
        a.setModelo("CRV");
        a.setPlaca("ABC1234");
        a.setVelocidadeMaxima(210);

        // Instanciando um objeto b da classe Carro por meio
        // de um método construtor com parametros que inicializam
        // os atributos do objeto
        Carro b = new Carro("LTD6713", "Amarelo","Mitsubishi", "TR4", 200);

        // Mostrando as refencias dos carros
        System.out.println("Valor da Referência do objeto a: " + a);
        System.out.println();
        System.out.println("Valor da Referência do objeto b: " + b);
        System.out.println();

        // Mostrando as refencias dos carros
        a.mostraReferencia();
        System.out.println();
        b.mostraReferencia();


        // Dados do objeto a
        System.out.println();
        System.out.println("Dados do objeto a");
        System.out.println("Placa: " + a.getPlaca());
        System.out.println("Fabricante: " + a.getFabricante());
        System.out.println("Modelo : " + a.getModelo());
        System.out.println("Cor: " + a.getCor());
        System.out.println("Velocidade Máxima: " + a.getVelocidadeMaxima());

        // Saltar uma linha
        System.out.println();

        // Dados do objeto b
        System.out.println("Dados do objeto b");
        System.out.println("Placa: " + b.getPlaca());
        System.out.println("Fabricante: " + b.getFabricante());
        System.out.println("Modelo : " + b.getModelo());
        System.out.println("Cor: " + b.getCor());
        System.out.println("Velocidade Máxima: " + b.getVelocidadeMaxima());

        a.acelerar();
        b.acelerar();
    }

}
