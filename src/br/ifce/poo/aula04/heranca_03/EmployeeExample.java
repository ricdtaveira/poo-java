package br.ifce.poo.aula04.heranca_03;

/**
 * EmployeeExample demonstra que CommissionedEmployee n�o herda 
 * tudo da ineterface Employee 
 * @author  Tony Sintes STYOOP
 * @version 1.0 
 */
public class EmployeeExample {
      public static void main( String [] args ) {
            EmpregadoComissionado c = new EmpregadoComissionado("Mr.","Sales",5.50,1.00);
            c.adicionarVendas(5);
            System.out.println( "Primeiro Nome: " + c.getPrimeiroNome() );
            System.out.println( "Ultimo   Nome: "  + c.getUltimoNome());
            System.out.println( "Salario  Base: R$"  + c.getSalario());
            System.out.println( "Salario Total: R$" + c.calcularPagamento() );
      }
}
