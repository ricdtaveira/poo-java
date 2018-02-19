package br.ifce.exercicio.exercicio01;

public class Porta {

    private boolean aberta;

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }



    public void abrir(boolean status) {
        setAberta(true);
    }

    public void fechar(boolean status) {
        setAberta(false);
    }
}
