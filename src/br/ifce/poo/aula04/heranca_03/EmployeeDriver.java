package br.ifce.poo.aula04.heranca_03;

/**
 * EmployeeDriver (Folha de Pagamento) instancia e usa os m�todos em objetos
 * CommissionedEmployee,HourlyEmployee e MensalistaEmployee.
 * @author  Tony Sintes STYOOP
 * @version 1.0
 */
public class EmployeeDriver {
    public static void main( String [] args ) {
        EmpregadoComissionado c_emp = new EmpregadoComissionado( "Jose", "Sales", 25000.00, 1000.00);
        EmpregadoHorista      h_emp = new EmpregadoHorista( "Carlos", "Sousa", 6.50 );
        EmpregadoMensalista   m_emp = new EmpregadoMensalista( "Joao", "Moura", 2000.00, 20.00);
      
        c_emp.adicionarVendas(5);
        h_emp.adicionarHoras(40);
        m_emp.adicionarFaltas(5); // empregado mensalista com 5 faltas

        System.out.println( "Pagamento Comisssionado: R$ " + c_emp.calcularPagamento() );
        System.out.println( "Pagamento Horista      : R$ " + h_emp.calcularPagamento() );
        System.out.println( "Pagamento Mensalista   : R$ " + m_emp.calcularPagamento() );
        //
        System.out.println();
        System.out.println();
        
        System.out.println( c_emp.imprimirCheckPagamento() );
        System.out.println( h_emp.imprimirCheckPagamento() );
        System.out.println( m_emp.imprimirCheckPagamento() );
    }
}

// Incluir funcionario mensalista