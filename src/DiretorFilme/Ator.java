package DiretorFilme;

import java.util.ArrayList;

public class Ator {
    private String nome;
    private ArrayList<Atuacao> atuacoes;

    public Ator(String nome) {
        this.nome = nome;
        this.atuacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAtuacao(Atuacao atuacao) {
        atuacoes.add(atuacao);
    }

    public void listarFilmes() {
        System.out.println("Filmes de " + nome + ":");
        for (Atuacao a : atuacoes) {
            System.out.println("- " + a.getFilme().getTitulo() + " como " + a.getPersonagem());
        }
    }
}
