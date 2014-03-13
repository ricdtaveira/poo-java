   /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifce.poo.aula02.metodo_construtor;

import br.ifce.poo.aula02.metodo_construtor.Aluno;

/**
 *
 * @author ricardo.taveira
 */
public class Hello {
 
     public static void main(String args[]) {
         Aluno x;
         x = new Aluno(100,"Jose","Rua dos tabajaras, 31");
         System.out.println("\nNome:" + x.getNome() +
           "\nMatricula:" + x.getMatricula() +
           "\nEndereço:" + x.getEndereco());
        // x.setMatricula(100);
        // x.setNome("Jose");
        // x.setEndereco("Rua dos Tabajaras, 31");
         System.out.println("\nNome:" + x.getNome() +
           "\nMatricula:" + x.getMatricula() +
           "\nEndereço:" + x.getEndereco());
    }
}


