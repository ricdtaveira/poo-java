package br.ifce.poo.aula15.jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AcessoMySql {
    
    Connection con;
    
    public AcessoMySql() {
    }
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bd_fiscal?user=admin&password=admin");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Não foi possível encontrar o Driver!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Não foi possível conectar ao banco!");
        }
        return con;
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
