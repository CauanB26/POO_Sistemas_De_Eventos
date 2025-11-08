package model;

/**
 * CLASSE CONCRETA Palestra (herda de Evento)
 * Herda titulo, data, duracaoHoras, orcamento, local
 * Uma palestra possui um palestrante convidade com nome, email e instituicao
 */

import java.util.Date;


public class Palestra extends Evento {

    private Palestrante palestrante;

    public Palestra(String titulo, Date data, int duracaoHoras, double orcamento, Local local, Palestrante palestrante) {

        super(titulo, data, duracaoHoras, orcamento, local);

        this.palestrante = palestrante;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }
}