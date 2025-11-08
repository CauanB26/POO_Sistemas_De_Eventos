package model;

/**
 * CLASSE ABSTRATA Local
 * O local pode ser Sala, auditorio ou laboratorio
 * Mas em comum, temos: nomeIdentificador, capacidadeMaxima (de pessoas) e bloco/predio
 */
public abstract class Local {

    protected String nomeIdentificador;
    protected int capacidadeMaxima;
    protected String blocoPredio;

    public Local(String nomeIdentificador, int capacidadeMaxima, String blocoPredio) {
        this.nomeIdentificador = nomeIdentificador;
        this.capacidadeMaxima = capacidadeMaxima;
        this.blocoPredio = blocoPredio;
    }

    public String getNomeIdentificador() {
        return nomeIdentificador;
    }

    public void setNomeIdentificador(String nomeIdentificador) {
        this.nomeIdentificador = nomeIdentificador;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getBlocoPredio() {
        return blocoPredio;
    }

    public void setBlocoPredio(String blocoPredio) {
        this.blocoPredio = blocoPredio;
    }
}