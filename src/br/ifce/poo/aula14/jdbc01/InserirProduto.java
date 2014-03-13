package br.ifce.poo.aula14.jdbc01;

import java.sql.*;

public class InserirProduto {


    public static void main (String args[]){

        String url = "jdbc:mysql://localhost:3306/BD_Pedidos";
	Connection con;
	Statement stmt;
	String query = "select * from TB_PRODUTO";

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
                }

		try {

			con = DriverManager.getConnection(url,"admin", "admin");

			stmt = con.createStatement();

			stmt.executeUpdate("insert into TB_PRODUTO (DESCRICAO,CODIGO,UNIDADE,VALOR_UNITARIO,ESTOQUE) " +
		         "values('Tomate', '001', 'KG', 4.00, 0.00)");

			stmt.executeUpdate("insert into TB_PRODUTO  (DESCRICAO,CODIGO,UNIDADE,VALOR_UNITARIO,ESTOQUE)" +
		         "values('Laranja', '002', 'KG', 3.00, 0.0)");

			stmt.executeUpdate("insert into TB_PRODUTO (DESCRICAO,CODIGO,UNIDADE,VALOR_UNITARIO,ESTOQUE)" +
		         "values('Pimentão', '003', 'KG', 2.00, 0.0)");

			
			ResultSet rs = stmt.executeQuery(query);

			System.out.println("Produtos:");
			while (rs.next()) {
				String s = rs.getString("DESCRICAO");
				float f = rs.getFloat("VALOR_UNITARIO");
				System.out.println(s + "   " + f);
			}

			stmt.close();
			con.close();

		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	



    }

}
