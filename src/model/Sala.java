package model;

/**
 * CLASSE CONCRETA Sala (herda de Local)
 * Herda "nomeIdentificador", "capacidadeMaxima" (de pessoas) e "blocoPredio"
 * Uma Sala possui (além do que herda) numero da sala e se possui ou nao equipamento multimidia
 */
public class Sala extends Local {

    private int numeroSala;
    private boolean temEquipamentoMultimidia;

    public Sala(String nomeIdentificador, int capacidadeMaxima, String blocoPredio, int numeroSala, boolean temEquipamentoMultimidia) {

        super(nomeIdentificador, capacidadeMaxima, blocoPredio);

        this.numeroSala = numeroSala;
        this.temEquipamentoMultimidia = temEquipamentoMultimidia;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public boolean isTemEquipamentoMultimidia() {
        return temEquipamentoMultimidia;
    }

    public void setTemEquipamentoMultimidia(boolean temEquipamentoMultimidia) {
        this.temEquipamentoMultimidia = temEquipamentoMultimidia;
    }
}