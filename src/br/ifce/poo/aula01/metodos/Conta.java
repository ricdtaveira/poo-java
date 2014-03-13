
package br.ifce.poo.aula01.metodos;


public class Conta {

    private int codigo;
    private float saldo;

    public Conta(int codigo, float saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar (float valor) {
        this.saldo = this.saldo + valor;
    }

    public void retirar (float valor) {
        this.saldo = this.saldo - valor;
    }

}
