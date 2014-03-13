package br.ifce.poo.aula10.enumeration.ex04;

public class Animal {
    String     codigo;
    String     nome;
    TipoAnimal tipoanimal;

    public Animal() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoAnimal getTipoanimal() {
        return tipoanimal;
    }

    public void setTipoanimal(TipoAnimal tipoanimal) {
        this.tipoanimal = tipoanimal;
    }


    public void falaAnimal(){
        switch(tipoanimal){
            case CAPRINO: System.out.println("BÉÉÉ !");

                          break;
            case SUINO:   System.out.println("CRUNCH FUNK!");
                          break;
            case BOVINO:  System.out.println("MUUUN!");
                          break;
            case EQUINO:  System.out.println("NUM SEI !");
                          break;
            case CANINO:  System.out.println("AU! AU!");
                          break;
            case FELINO:  System.out.println("MIAU!");
                          break;
        }
    }

}
