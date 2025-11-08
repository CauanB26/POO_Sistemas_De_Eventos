package model;

/**
 * CLASSE CONCRETA Instrutor (herda de PessoaResponsavel)
 * Herda "nome" e "email"
 * Um instrutor possui (além de nome e email) funcao administrativa
 */
public class Organizador extends PessoaResponsavel {

    private String funcaoAdministrativa;

    public Organizador(String nome, String email, String funcaoAdministrativa) {

        // Recebe nome e email de PessoaResponsavel
        super(nome, email);

        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }
}