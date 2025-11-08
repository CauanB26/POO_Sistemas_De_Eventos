package model;

/**
 * Participantes são alunos interessados
 * Cada participante possui "nome", "CPF", "email" e "curso"
 **/

import java.util.ArrayList;
import java.util.List;

public class Participante {

    private String nome;
    private String cpf;
    private String email;
    private String curso;

    // Um participante pode se inscrever em mais de um evento
    private List<Evento> eventosInscritos;


    public Participante(String nome, String cpf, String email, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.curso = curso;

        // Cria a lista vazia
        this.eventosInscritos = new ArrayList<>();
    }

    // Métodos

    // Incresve o participante apenas se o evento nao for NULL e o participante ainda não
    // estiver escrito nele
    public void inscreverEmEvento(Evento evento) {
        if (evento != null && !this.eventosInscritos.contains(evento)) {
            this.eventosInscritos.add(evento);
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Evento> getEventosInscritos() {
        return eventosInscritos;
    }

    // Não devemos ter um "setEventosInscritos", pois, isso ignoraria nossa regra criada
    // pelo nosso metodo ( o de nao permitir a criacao de eventos duplicados)


}