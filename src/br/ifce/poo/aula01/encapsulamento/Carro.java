
package br.ifce.poo.aula01.encapsulamento;

public class Carro {

    private String placa;
    private String cor;
    private String fabricante;
    private String modelo;
    private int    velocidadeMaxima;

    public Carro() {
    }

    public Carro(String placa, String cor, String fabricante, String modelo, int velocidadeMaxima) {
        this.placa = placa;
        this.cor = cor;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar () {
        System.out.println();
        System.out.println("Carro:" + this);
        System.out.println("Placa:" + this.getPlaca());
        System.out.println("Modelo:" + this.getModelo());
        System.out.println("fabricante:" + this.getFabricante());
        System.out.println("VRUUUUMMMMM! Acelerando !");

    }

    public void mostraReferencia () {

         System.out.println("Referencia chamada internamente: " + this);
        
    }

}
