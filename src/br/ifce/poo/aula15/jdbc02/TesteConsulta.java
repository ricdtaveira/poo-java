package br.ifce.poo.aula15.jdbc02;

import java.util.ArrayList;
import java.util.List;

public class TesteConsulta {

    public static void main(String[] args) {

        //ClienteBean cliente = new ClienteBean();
        ClienteDAO c        = new ClienteDAO();

        List<ClienteBean> clientes = new ArrayList();
        clientes = c.listarClientes("Jose");

        for (ClienteBean cl : clientes ) {
            System.out.println("\nId:"     + cl.getId());
            System.out.println("Codigo:" + cl.getCodigo());
            System.out.println("Nome:"   + cl.getNome());
        }
    }
}
