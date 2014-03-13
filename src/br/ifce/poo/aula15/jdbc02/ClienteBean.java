package br.ifce.poo.aula15.jdbc02;

public class ClienteBean {
    
    private Long   Id;
    private String codigo;
    private String nome;


    public ClienteBean() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
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
    
}
