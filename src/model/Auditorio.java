package model;

/**
 * CLASSE CONCRETA Auditorio (herda de Local)
 * Herda "nomeIdentificador", "capacidadeMaxima" (de pessoas) e "blocoPredio"
 * Um Auditorio possui ou não(além do que herda), sistema de som e estrutura para traducao simultanea
 */

public class Auditorio extends Local {

    private boolean temSistemaSom;
    private boolean temEstruturaTraducao;

    // --- Construtor ---
    public Auditorio(String nomeIdentificador, int capacidadeMaxima, String blocoPredio, boolean temSistemaSom, boolean temEstruturaTraducao) {

        super(nomeIdentificador, capacidadeMaxima, blocoPredio);

        this.temSistemaSom = temSistemaSom;
        this.temEstruturaTraducao = temEstruturaTraducao;
    }

    public boolean isTemSistemaSom() {
        return temSistemaSom;
    }

    public void setTemSistemaSom(boolean temSistemaSom) {
        this.temSistemaSom = temSistemaSom;
    }

    public boolean isTemEstruturaTraducao() {
        return temEstruturaTraducao;
    }

    public void setTemEstruturaTraducao(boolean temEstruturaTraducao) {
        this.temEstruturaTraducao = temEstruturaTraducao;
    }
}