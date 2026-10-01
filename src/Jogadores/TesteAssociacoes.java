package Jogadores;

public class TesteAssociacoes {
    public static void main(String[] args) {

        // 1) associação simples: Turma -> Professor
        Professor professor = new Professor("Daniel", "Programacao Orientada a Objetos");
        Turma turma = new Turma("ADS 2o Semestre", professor);
        System.out.println("Professor da turma " + turma.getNome() + ": "
                + turma.getProfessor().getNome());

        System.out.println();

        // 2) agregação: os jogadores existem ANTES do time
        Jogador j1 = new Jogador("Carlos", 10);
        Jogador j2 = new Jogador("Marcos", 7);
        Jogador j3 = new Jogador("Pedro", 9);

        Time time = new Time("Franca Basquete");
        time.adicionarJogador(j1);
        time.adicionarJogador(j2);
        time.adicionarJogador(j3);
        time.listarJogadores();

        System.out.println();

        // 3) composição: os cômodos são criados pela própria Casa
        Casa casa = new Casa("Rua das Flores, 100");
        casa.listarComodos();
    }
}
