package br.ifce.poo.aula14.jdbc01;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DaoProduto {
    
    private String INCLUI =  "INSERT INTO TB_PRODUTO (DESCRICAO,CODIGO,UNIDADE,VALOR_UNITARIO,ESTOQUE) " +
                              "VALUES (?, ?, ?, ?, ?);";
    private String ALTERA =  "UPDATE ) " +
                              "VALUES ?, ?, ?, ?, ?);";
    private String EXCLUSAO =  "UPDATE ) " +
                              "VALUES ?, ?, ?, ?, ?);";
    private String SELECAO  = "UPDATE ) " +
                              "VALUES ?, ?, ?, ?, ?);";

    Connection con;

    Statement stmt;

    public void conectar(String url, String login, String senha) {
        try {
	      Class.forName("com.mysql.jdbc.Driver");

        } catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
	}

	try {

		con = DriverManager.getConnection(url,login, senha);
		stmt = con.createStatement();

		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
    }

    public void desconectar () {
        try {
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void inserir (String descricao, String codigo, String unidade, float valor, float estoque) {

        PreparedStatement incluirProduto;
        try {
            incluirProduto = con.prepareStatement(INCLUI);
            incluirProduto.setString(1, descricao);
            incluirProduto.setString(2, codigo);
            incluirProduto.setString(3, unidade);
            incluirProduto.setFloat(4, valor);
            incluirProduto.setFloat(5, estoque);
            incluirProduto.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void alterar () {

    }

    public void excluir () {

    }



}
