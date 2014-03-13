
package br.ifce.poo.aula15.jdbc02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    
    PreparedStatement pstm;
    ResultSet rs;
    String consultaCliente = "SELECT * FROM TB_CLIENTE WHERE NOME LIKE ?";
    String cadastraCliente = "INSERT INTO TB_CLIENTE (CODIGO, NOME) VALUES(?,?)";
    String alteraCliente   = "UPDATE TB_CLIENTE SET CODIGO = ?, NOME = ? WHERE CODIGO = ?";
    AcessoMySql         bd = new AcessoMySql();
    Connection  con;
    
    /** Creates a new instance of ClienteControl */
    public ClienteDAO() {
    }
    
    public void alterarCliente(ClienteBean cliente){
        try{
            con = bd.conectar();
            pstm = con.prepareStatement(alteraCliente);
            pstm.setString(1, cliente.getCodigo());
            pstm.setString(2, cliente.getNome());            
            pstm.executeUpdate();
            bd.desconectar();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void cadastrarCliente(ClienteBean cliente){
        try{
            con = bd.conectar();
            pstm = con.prepareStatement(cadastraCliente);
            pstm.setString(1, cliente.getCodigo());
            pstm.setString(2, cliente.getNome());            
            pstm.executeUpdate();
            bd.desconectar();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<ClienteBean> listarClientes(String nome){
        List<ClienteBean> clientes = new ArrayList();
        try{
            con = bd.conectar();
            pstm = con.prepareStatement(consultaCliente);
            pstm.setString(1, "%"+nome+"%");//SELECT * FROM CLIENTES WHERE NOME LIKE claudio
            rs = pstm.executeQuery();
            ClienteBean cli;
            while (rs.next()){
                cli = new ClienteBean();
                cli.setId(rs.getLong("ID"));
                cli.setCodigo(rs.getString("CODIGO"));
                cli.setNome(rs.getString("NOME"));
                clientes.add(cli);               
            }
            bd.desconectar();
        } catch(Exception e){
            e.printStackTrace();
        }
        return clientes;
    }
    
}
