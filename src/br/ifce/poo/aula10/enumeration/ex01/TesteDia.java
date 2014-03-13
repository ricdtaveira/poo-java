package br.ifce.poo.aula10.enumeration.ex01;

import br.ifce.poo.aula10.enumeration.ex01.Dia;

public class TesteDia {

    Dia dia;

    public TesteDia(Dia dia) {
        this.dia = dia;
    }

    public void tellItLikeItIs() {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segundas são pessimas.");
                break;

            case SEXTA:
                System.out.println("Sextas são melhores.");
                break;

            case SABADO:
            case DOMINGO:
                System.out.println("Fins de semana são excelentes.");
                break;

            default:
                System.out.println("Dias do meio da semana são assim....");
                break;
        }
    }

    public static void main(String[] args) {
        TesteDia primeiroDia = new TesteDia(Dia.SEGUNDA);
        primeiroDia.tellItLikeItIs();

        TesteDia terceiroDia = new TesteDia(Dia.QUARTA);
        terceiroDia.tellItLikeItIs();

        TesteDia quintoDia = new TesteDia(Dia.SEXTA);
        quintoDia.tellItLikeItIs();

        TesteDia sextoDia = new TesteDia(Dia.SABADO);
        sextoDia.tellItLikeItIs();

        TesteDia setimoDia = new TesteDia(Dia.DOMINGO);
        setimoDia.tellItLikeItIs();


    }
}
