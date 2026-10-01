package Escola;

// ASSOCIAÇÃO SIMPLES: a Turma só guarda uma referência a um Professor
public class Turma {
    private String nome;
    private Professor professor;   // associação simples (sem diamante)

    public Turma(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }
}
