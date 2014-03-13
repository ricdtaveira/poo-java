package br.ifce.poo.aula04.heranca_03;

/**
 * Empregado é uma classe abstrata. Todos os empregados tem um primeiro_nome, ultimo_nome,
 * e um salário. Cada empregado pode calcular o seu salario. Todavia, o mecanismo
 * para calcular o salário depende do tipo de empregado. Assim, cada subtipo deve definir,
 * o modo como calcular o seu salário.
 * @author  Tony Sintes STYOOP
 * @version 1.0 
 */
public abstract class Empregado {
      private String primeiro_nome;
      private String ultimo_nome;
      protected double salario; // Salário 

      public Empregado( String primeiro_nome, String ultimo_nome, double salario ) {
          this.primeiro_nome = primeiro_nome;
          this.ultimo_nome  = ultimo_nome;
          this.salario = salario;
      }

      public double getSalario() {
            return salario;
      }

      public String getPrimeiroNome() {
          return primeiro_nome;
      }

      public String getUltimoNome() {
          return ultimo_nome;
      }

      public abstract double calcularPagamento();
      
      public String imprimirCheckPagamento() {
          String nome_completo = ultimo_nome + ", " + primeiro_nome;
          return ( "Pagamento: " + nome_completo + " R$ " + calcularPagamento() );
      }
}
