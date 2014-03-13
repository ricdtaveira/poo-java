package br.ifce.poo.aula11.excecoes01;

public class RelatorioFinanceiro {

    boolean dadosCorretos=false;

    public void metodoMau() throws ExcecaoContabil {

        if (!dadosCorretos) {
            System.out.println("Vai levantar a execeção !");
            throw new ExcecaoContabil("Dados Incorretos");
        }
    }

    public void metodoBom() {
        try {

            metodoMau();

        } catch (ExcecaoContabil ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        System.out.println("Passou !");
    }
}

