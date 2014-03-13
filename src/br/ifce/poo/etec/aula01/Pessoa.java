/*
 * Esta classe será usada em vários exemplos.
 *
 * Nela é possível verificar os principais elementos que compõe uma
 * classe, que são: os dados (atributos) e as suas funcionalidades (métodos).
 *
 * Os atributos representados possuem um identificador.
 * Os identificadores de atributos possuem um tipo e uma visibilidade.
 * No exemplo:
 * O identificador  nome possue o tipo String e a visibilidade public.
 * O identificador  endereco possue o tipo String e a visibilidade private.
 *
 * A visibilidade private não permite o acesso direto(leitura e gravação)
 * de um atributo por uma funcionalidade definida fora da classe ao qual
 * pertence. Isto caracteriza o encapsulamento. O acesso só é feito por um
 * método (com visibilidade public) definido dentro da classe que acessa o
 * atributo com visibilidade private correspondente.
 * Exemplos:
 * O método getEndereco que retorna o valor do atributo endereço. Este tipo
 * de método é chamado de método acessor, pois acessa e retorna o valor de
 * um atributo.
 * O método setEndereco que modifica o valor de um atributo, porque envia um
 * valor por meio do parametro p_endereco e modifica o valor do atributo
 * correspondente.
 *
 * Então métodos acessores e modificadores acessam atributos encapsulados.
 *
 * Atributos não encapsulados (public) são acessados diretamente por meio do
 * nome do objeto.
 *
 * Os métodos construtores são responsáveis pela inicialização dos atributos
 * quando um objeto é criado na memória.
 * 
 */

package br.ifce.poo.etec.aula01;

/**
 *
 * @author ricardo.taveira
 */
public class Pessoa {

    public   String nome;
    private  String endereco;

    // Método Construtor
    Pessoa (String p_nome, String p_endereco) {

        nome = p_nome;
        endereco = p_endereco;

    }

    // Método acessor
    public String getEndereco() {
        return endereco;
    }

    // Método modificador
    public void setEndereco(String p_endereco){
        endereco = p_endereco;
    }

}
