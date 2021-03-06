package br.ifce.poo.aula04.heranca_03;

/**
 * EmpregadoMensalista herda de Empregado.
 * EmpregadoMensalista tamb�m demonstra programa��o por diferencia��o. 
 * @author  Ricardo Taveira
 * @version 1.0 
 */
public class EmpregadoMensalista extends Empregado {

      private int    faltas;      // quantidade de dias n�o trabalhados
      private double valorfalta;  // valor de cada dia n�o trabalhado

      public EmpregadoMensalista( String primeiro_nome, String ultimo_nome, double salario, double valorfalta ) {
            super( primeiro_nome, ultimo_nome, salario ); // chama o construtor original para inicializar corretamente
            this.valorfalta = valorfalta;
      }

      public double calcularPagamento() {
            return salario - (faltas * valorfalta);
      }

      public void adicionarFaltas( int faltas ) {
            this.faltas = this.faltas + faltas;
      }

      public void inicializarFaltas() {
            faltas = 0;
      }
}