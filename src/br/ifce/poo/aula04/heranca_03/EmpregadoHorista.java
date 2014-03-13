package br.ifce.poo.aula04.heranca_03;

/**
 * EmpregadoHorista extende (herda) Empregado.
 * EmpregadoHorista também demonstra programação por diferença.
 * @author  Tony Sintes STYOOP
 * @version 1.0 
 */
public class EmpregadoHorista extends Empregado {

      private int horas; // quantidade de horas trabalhadas

      public EmpregadoHorista( String primeiro_nome, String ultimo_nome, double salario ) {
            super( primeiro_nome, ultimo_nome, salario ); // chama o construtor original para inicializar corretamente
      }

      public double calcularPagamento() {
            return getSalario() * horas;
      }

      public void adicionarHoras( int horas ) {
            this.horas  = this.horas + horas;
      }

      public void inicializarHoras() {
            horas = 0;
      }
}