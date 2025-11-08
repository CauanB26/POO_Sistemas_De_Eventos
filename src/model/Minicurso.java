package model;

/**
 * CLASSE CONCRETA Minicurso (herda de Evento)
 * Herda titulo, data, duracaoHoras, orcamento, local
 * Minicursos sao ministrados por um ou mais instrutores, tem uma carga horaria e uma lista de materias de apoio
 */

import java.util.Date;
import java.util.List;

public class Minicurso extends Evento {

    private int cargaHoraria;
    private List<String> listaMateriais;

    private List<Instrutor> instrutores;

    public Minicurso(String titulo, Date data, int duracaoHoras, double orcamento, Local local, int cargaHoraria, List<String> listaMateriais, List<Instrutor> instrutores) {

        super(titulo, data, duracaoHoras, orcamento, local);

        this.cargaHoraria = cargaHoraria;
        this.listaMateriais = listaMateriais;
        this.instrutores = instrutores;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<String> getListaMateriais() {
        return listaMateriais;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

}