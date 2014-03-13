/*
 * Este exemplo mostra:
 * O exemplo de criação de um objeto Pessoa.
 * A chamada de uma mensagem. Uma mensagem é chamada de um método
 * de um objeto instanciado na memória. 
 * No caso o identificador pessoa é uma instancia de um objeto da classe Pessoa.
 * As mensagens chamadas são os métodos acessores e modificadores do objeto
 * pessoa que é uma instancia da classe Pessoa.
 *
 */

package br.ifce.poo.etec.aula01;

/**
 *
 * @author ricardo.taveira
 */
public class Aula01Exemplo02 {

    public static void main(String[] args) {
        // cria um objeto pessoa chamando o método construtor
        // o metodo construtor inicializa simultanente os dois atributos de Pessoa
        Pessoa pessoa = new Pessoa("José Maria", "Av 13 de Maio 2081, Benfica, Fortaleza-CE");

        // acessa o valor do atributo endereço por meio de uma mensagem
        // a chamada da mensagem pessoa.getEndereco() retorna uma String
        // que alimenta o parametro do método println da classe System.out
        // System.out representa a console

        System.out.println(pessoa.getEndereco());

        // modifica o atributo endereço por meio de uma mensagem
        pessoa.setEndereco("Av da Universidade 3200, Benfica, Fortaleza-CE");

        // mostra novamente o valor do atributo endereço para evidenciar
        // a modificação do mesmo
         System.out.println(pessoa.getEndereco());

        // modifica o atributo nome de um objeto da Classe Pessoa
        // usando um operador de atribuicao diretamente sobre o
        // objeto. Isto é possível porque o atributo tem visibilidade
        // public.
         pessoa.nome = "João da Silva";

        // mostra o valor do atributo nome do objeto pessoa diretamente
        // sem chamar um método acessor
         System.out.println(pessoa.nome);

        // Observação: O uso de atributos com visibilidade public fere
        // o conceito de encapsulamento. Assim não recomenda-se o uso de
        // de atributos com visibilidade public.
        // Apenas métodos podem ter visibilidade public. è uma regra padrão
        // na Engenharia de Software prover o acesso a atributos de uma classe
        // pelo uso de métodos acessores e modificadores.         

    }

}
