package Jogadores;

import java.util.ArrayList;

// AGREGAÇÃO: o Time reúne Jogadores que já existiam antes dele
public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    // o jogador já existe e é recebido de fora - agregação
    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void listarJogadores() {
        System.out.println("Jogadores do " + nome + ":");
        for (Jogador jogador : jogadores) {
            System.out.println("- " + jogador.getNome());
        }
    }
}
