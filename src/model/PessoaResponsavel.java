package model;

/**
 * CLASSE ABSTRATA PessoaResponsavel
 * Uma pessoa responsavel pode ser Instrutor ou Organizador
 * Temos nome e email como atributos comuns entre os tipos de pessoas responsaveis
 */

public abstract class PessoaResponsavel {

    protected String nome;
    protected String email;

    public PessoaResponsavel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}