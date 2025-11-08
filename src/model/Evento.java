package model;

/**
 * CLASSE ABSTRATA Evento
 * O evento pode ser Palestra, Minicurso ou Seminario.
 * Temos titulo, data, duracao, orcamento, local e participantes
 */

import java.util.ArrayList;
import java.util.Date; // Para o atributo 'data'
import java.util.List;  // Para a lista de participantes

public abstract class Evento {

    protected String titulo;
    protected Date data;
    protected int duracaoHoras;
    protected double orcamento;

    /**
     * Um Evento TEM UM Local.
     */

    protected Local local;

    /**
     * Um Evento TEM MUITOS Participantes.
     */
    protected List<Participante> participantesInscritos;


    public Evento(String titulo, Date data, int duracaoHoras, double orcamento, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracaoHoras = duracaoHoras;
        this.orcamento = orcamento;
        this.local = local;

        // Cria e inicializa lista de inscritos vazia, pronta para receber participantes.
        this.participantesInscritos = new ArrayList<>();
    }

    // Metodo que adiciona participante fazendo a verificacao da qtd atual de participantes x capacidade max

    public boolean adicionarParticipante(Participante p) {

        // pega capacidade max do local
        int capacidade = this.local.getCapacidadeMaxima();

        // pega qtd de inscritos atual
        int inscritosAtuais = this.participantesInscritos.size();

        // verifica se cabe adicionar mais esse participante
        if (inscritosAtuais < capacidade) {
            this.participantesInscritos.add(p);
            return true;
        }
        else {
            // evento lotado
            return false;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<Participante> getParticipantesInscritos() {
        return participantesInscritos;
    }

}