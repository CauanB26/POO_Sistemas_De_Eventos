package model;

/**
 * CLASSE CONCRETA Instrutor (herda de PessoaResponsavel)
 * Herda "nome" e "email"
 * Um instrutor possui (além de nome e email) formacao e area de especializacao
 */

public class Instrutor extends PessoaResponsavel {

    private String formacao;
    private String areaEspecializacao;

    public Instrutor(String nome, String email, String formacao, String areaEspecializacao) {

        // Recebe nome e email de PessoaResponsavel
        super(nome, email);

        this.formacao = formacao;
        this.areaEspecializacao = areaEspecializacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }
}