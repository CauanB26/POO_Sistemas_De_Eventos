# AC POO - Sistema de Gestão de Eventos Acadêmicos

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)

## 📝 Descrição

Projeto desenvolvido para a Avaliação Continuada (AC) da disciplina de Programação Orientada a Objetos (POO).

O sistema simula o back-end de um gerenciador de eventos acadêmicos (palestras, minicursos, seminários) para uma universidade. O objetivo é aplicar os conceitos fundamentais de POO para modelar um domínio complexo, gerenciando diferentes tipos de eventos, locais, participantes e responsáveis.

---

## 📂 Estrutura do Projeto (Arquitetura MVC)

O projeto está organizado seguindo o padrão de arquitetura **MVC (Model-View-Controller)**:

* **`/src/model`**
    Contém todas as classes de entidade que representam os dados e as regras de negócio do sistema.
    * **Hierarquias de Eventos**: `Evento` (Abstrata) -> `Palestra`, `Minicurso`, `Seminario`.
    * **Hierarquias de Locais**: `Local` (Abstrata) -> `Sala`, `Auditorio`, `Laboratorio`.
    * **Hierarquias de Pessoas**: `PessoaResponsavel` (Abstrata) -> `Instrutor`, `Organizador`.
    * **Outras Entidades**: `Participante` e `Palestrante`.

* **`/src/control`**
    Contém a classe de execução do programa (`Programa.java`). Ela é responsável por instanciar os objetos do modelo e simular o funcionamento do sistema (conforme Tarefa 3 da AC).

* **`/src/view`**
    (Não faz parte do escopo desta AC)

---

## ✨ Conceitos de POO Aplicados

Este projeto demonstra a aplicação prática dos pilares da Programação Orientada a Objetos:

* **Abstração**: Uso de classes `abstract` (`Evento`, `Local`, `PessoaResponsavel`) para definir "moldes-mãe" que não podem ser instanciados, servindo apenas de base para a herança.
* **Herança**: Reutilização de código onde classes-filhas especializam classes-mãe. (ex: `Palestra` **É-UM** `Evento`).
* **Encapsulamento**: Proteção dos atributos das classes usando `private` e `protected`. O acesso é controlado via getters/setters e a lógica de negócio (como a validação de vagas) é protegida dentro da própria classe (`Evento.adicionarParticipante()`).
* **Polimorfismo**: A classe `Evento` possui um atributo do tipo `Local`, que em tempo de execução pode ser um objeto `Sala`, `Auditorio` ou `Laboratorio`.
* **Associação (TEM-UM)**: Relacionamento entre classes. (ex: `Evento` **TEM-UM** `Local`).
* **Agregação/Composição (TEM-MUITOS)**: Uso de `List` e `ArrayList` para gerenciar coleções de objetos. (ex: `Minicurso` **TEM-MUITOS** `Instrutores`; `Evento` **TEM-MUITOS** `Participantes`).

---

## Exemplo de saida  

```plaintext
Pessoas e Participantes criados.
Locais criados.
Eventos criados.

 Testando Inscrições (Regra de Negócio)
Tentando inscrever Ted Mosby na palestra 'O Futuro da Inteligência Artificial'...
-> Inscrição realizada com sucesso!
Tentando inscrever Darth Vader na palestra 'O Futuro da Inteligência Artificial'...
-> Inscrição realizada com sucesso!
Tentando inscrever Ted Mosby no 'Minicurso de Desenvolvimento Full-Stack'...
-> Inscrição realizada com sucesso!

RESULTADO FINAL
Vagas restantes na Palestra: 298
Vagas restantes no Minicurso: 29

Eventos que o Ted Mosby está inscrito:
  - O Futuro da Inteligência Artificial
  - Minicurso de Desenvolvimento Full-Stack
```
---

## ▶️ Como Executar

1.  Clone este repositório.
2.  Abra o projeto em uma IDE Java.
3.  Compile o projeto.
4.  Localize o arquivo `Programa.java` no pacote `control`.
5.  Execute o método `main()`.

O output da execução aparecerá no console, demonstrando a criação dos objetos e a simulação da inscrição de participantes nos eventos, com a validação de vagas.
