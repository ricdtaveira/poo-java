package br.ifce.poo.aula14.jdbc01;

public class TesteDao {

    public static void main (String args[]){
        String url = "jdbc:mysql://localhost:3306/BD_Pedidos";
        String login = "admin";
        String senha = "admin";

        String descricao="Cebola";
        String codigo="006";
        String unidade="Kg";
        float valor  = (float) 1.50;
        float estoque= (float) 0.00;

        DaoProduto dsProduto =new DaoProduto();
        dsProduto.conectar(url, login, senha);
        dsProduto.inserir(descricao, codigo, unidade, valor, estoque);
        dsProduto.desconectar();

    }
}