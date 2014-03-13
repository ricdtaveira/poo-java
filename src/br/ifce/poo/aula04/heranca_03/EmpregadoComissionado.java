package br.ifce.poo.aula04.heranca_03;

/**
 * Empregado Comissionado demonstra herança de atributos e métodos de Empregado.
 * Empregado Comissionado também demonstra programação por diferença.Ou seja, a classe
 * filha herda de uma classe mãe(atributos e métodos) e adiciona apenas o código que a
 * torna diferente da classe mãe.
 * @author  Tony Sintes STYOOP
 * @version 1.0 
 */
public class EmpregadoComissionado extends Empregado {
      private double comissao;  // o valor de comissão de cada unidade vendida
      private int    unidades;  // a quantidade de unidades vendidas
      
      public EmpregadoComissionado( String primeiro_nome, String ultimo_nome, double salario, double comissao ) {
            super( primeiro_nome, ultimo_nome, salario ); // chama o construtor original
            this.comissao   = comissao;
      }

      public double calcularPagamento() {
            return getSalario() + ( comissao * unidades );
      }

      public void adicionarVendas( int unidades ) {
            this.unidades = this.unidades + unidades;
      }

      public void iniciarVendas() {
            unidades = 0;
      }

}
