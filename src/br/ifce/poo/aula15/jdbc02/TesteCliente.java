package br.ifce.poo.aula15.jdbc02;

import java.util.ArrayList;
import java.util.List;

public class TesteCliente {

    public static void main(String[] args) {

        ClienteBean cliente = new ClienteBean();
        ClienteDAO c        = new ClienteDAO();

        cliente.setCodigo("001");
        cliente.setNome("Mario dos Anjos Joao");
        c.cadastrarCliente(cliente);

        cliente.setCodigo("002");
        cliente.setNome("Joao Severino da Silva");
        c.cadastrarCliente(cliente);

        cliente.setCodigo("003");
        cliente.setNome("Mario dos Anjos Joao");
        c.cadastrarCliente(cliente);

        cliente.setCodigo("004");
        cliente.setNome("Joao Severino da Silva");
        c.cadastrarCliente(cliente);

        cliente.setCodigo("005");
        cliente.setNome("Joao Jose Mariano");
        c.cadastrarCliente(cliente);


        List<ClienteBean> clientes = new ArrayList();
        clientes = c.listarClientes("Joao");

        for (ClienteBean cl : clientes ) {
            System.out.println("\nId:"     + cl.getId());
            System.out.println("\nCodigo:" + cl.getCodigo());
            System.out.println("\nNome:"   + cl.getNome());
        }
    }
}
