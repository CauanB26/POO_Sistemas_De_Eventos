package control;

import model.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        System.out.println("Instanciando objetos para exemplificar o modelo...\n");

        // Instaciando: Palestrante, Instrutores, Organizador, Participantes

        Palestrante palestranteIA = new Palestrante("Dr. Jon Snow", "ana.silva@monster.com", "Monster");

        Instrutor instrutorBD = new Instrutor("Prof. Michael Scoot", "michael.scoot@ibmec.br", "Doutorado", "Banco de Dados");
        Instrutor instrutorPOO = new Instrutor("Prof. Thiago Souza", "thiago.souza@ibmec.br", "Mestrado", "Programação Orientada a Objetos");

        Organizador coordenador = new Organizador("Pamela Besley", "pamela.besley@ibmec.br", "Coordenadora de Eventos");

        Participante aluno1 = new Participante("Ted Mosby", "111.111.111-11", "ted.mosby@aluno.ibmec.br", "Arquitetura");
        Participante aluno2 = new Participante("Darth Vader", "222.222.222-22", "darth.vader@aluno.ibmec.br", "Moda");

        System.out.println("Pessoas e Participantes criados.");

        // Instanciando locais: Sala, Auditorio, Laboratorio

        Local sala101 = new Sala("Sala 101 - Bloco A", 10, "Bloco A", 101, true);
        Local auditorioPrincipal = new Auditorio("Auditório Principal", 300, "Bloco C", false, true);
        Local labInformatica = new Laboratorio("Tech 1 - Primeiro Andar", 30, "Bloco B", 30, "informática");

        System.out.println("Locais criados.");

        // Instanciando eventos: (Palestra, Minicurso, Seminario)

        Evento palestraIA = new Palestra(
                "O Futuro da Inteligência Artificial",
                new Date(),
                2,
                5000.00,
                auditorioPrincipal, // O objeto "auditorioPrincipal"
                palestranteIA       // O objeto "palestranteIA"
        );


        // Para o minicurso, precisamos criar as listas de instrutores e materiais
        List<Instrutor> instrutoresMinicurso = Arrays.asList(instrutorBD, instrutorPOO);
        List<String> materiaisMinicurso = Arrays.asList("Notebook", "IDE Java Instalada", "PostgreSQL");

        Evento minicursoDev = new Minicurso(
                "Minicurso de Desenvolvimento Full-Stack",
                new Date(),
                8,
                2500.00,
                labInformatica,     // O objeto 'labInformatica'
                8,                  // Carga horária
                materiaisMinicurso, // A lista de materiais
                instrutoresMinicurso // A lista de instrutores
        );


        Evento seminarioTCC = new Seminario(
                "Apresentações de TCC - Tech",
                new Date(),
                4,
                500.00,
                sala101,            // O objeto 'sala101'
                "Gestão de Projetos Ágeis",
                "Aluno Finalista",
                "Prof. Orientador"
        );

        System.out.println("Eventos criados.");
        System.out.println("\n Testando Inscrições (Regra de Negócio)");

        // Teste 1: Inscrever Aluno 1 na Palestra
        System.out.println("Tentando inscrever " + aluno1.getNome() + " na palestra '" + palestraIA.getTitulo() + "'...");

        // 1. Tenta adicionar no evento (verifica a vaga)
        boolean sucessoInscricao = palestraIA.adicionarParticipante(aluno1);

        if (sucessoInscricao) {
            // 2. Se deu certo, avisa o aluno para ele "anotar" na lista dele
            aluno1.inscreverEmEvento(palestraIA);
            System.out.println("-> Inscrição realizada com sucesso!");
        } else {
            System.out.println("-> Falha: Evento lotado.");
        }

        // Teste 2: Inscrever Aluno 2 no mesmo evento (deve funcionar)
        System.out.println("Tentando inscrever " + aluno2.getNome() + " na palestra '" + palestraIA.getTitulo() + "'...");
        if (palestraIA.adicionarParticipante(aluno2)) {
            aluno2.inscreverEmEvento(palestraIA);
            System.out.println("-> Inscrição realizada com sucesso!");
        } else {
            System.out.println("-> Falha: Evento lotado.");
        }

        // Teste 3: Inscrever Aluno 1 no Minicurso (deve funcionar)
        System.out.println("Tentando inscrever " + aluno1.getNome() + " no '" + minicursoDev.getTitulo() + "'...");
        if (minicursoDev.adicionarParticipante(aluno1)) {
            aluno1.inscreverEmEvento(minicursoDev);
            System.out.println("-> Inscrição realizada com sucesso!");
        } else {
            System.out.println("-> Falha: Evento lotado.");
        }

        System.out.println("\nRESULTADO FINAL");

        // Exibindo o resultado final
        int vagasRestantesPalestra = palestraIA.getLocal().getCapacidadeMaxima() - palestraIA.getParticipantesInscritos().size();
        System.out.println("Vagas restantes na Palestra: " + vagasRestantesPalestra);

        int vagasRestantesMinicurso = minicursoDev.getLocal().getCapacidadeMaxima() - minicursoDev.getParticipantesInscritos().size();
        System.out.println("Vagas restantes no Minicurso: " + vagasRestantesMinicurso);

        System.out.println("\nEventos que o " + aluno1.getNome() + " está inscrito:");
        // Loop 'for-each' para percorrer a lista de eventos do aluno
        for (Evento evento : aluno1.getEventosInscritos()) {
            System.out.println("  - " + evento.getTitulo());
        }
    }
}