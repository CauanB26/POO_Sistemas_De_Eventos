package model;


/**
 * CLASSE CONCRETA Laboratorio (herda de Local)
 * Herda "nomeIdentificador", "capacidadeMaxima" (de pessoas) e "blocoPredio"
 * Um Laboratorio possui (além do que herda) numero de computadores disponiveis e se é de informatica ou química
 */

public class Laboratorio extends Local {

    private int numeroComputadores;
    private String tipo; // "informática" ou "química"

    public Laboratorio(String nomeIdentificador, int capacidadeMaxima, String blocoPredio, int numeroComputadores, String tipo) {

        super(nomeIdentificador, capacidadeMaxima, blocoPredio);

        this.numeroComputadores = numeroComputadores;
        this.tipo = tipo;
    }

    public int getNumeroComputadores() {
        return numeroComputadores;
    }

    public void setNumeroComputadores(int numeroComputadores) {
        this.numeroComputadores = numeroComputadores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}