package br.ifce.poo.aula03.metodo_atributo_static;

public class Casa {
     private Porta porta;
     private int numero;
     public java.awt.Color cor;

    public Casa() {
        porta = new Porta();
        numero = ++contagem * 10;

    }

    public void abrePorta() {
            porta.abre();
    }

    public static String arquiteto = "Zé";
    private static int contagem = 0;

    static {
        System.out.println("Casa criada!");
        if ( contagem > 0 ) {
           arquiteto = "Og";          
        }
    }

    public String toString(){
        return ("\nNumero:" + numero + "\nContagem: " + contagem +
                "\nArquiteto:" + arquiteto);
    }
}