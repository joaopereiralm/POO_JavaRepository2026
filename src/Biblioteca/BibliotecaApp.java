package Biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Livro lv1 = new Livro ("Devoradores de Estrelas", "Andy Weir", true);
        Livro lv2 = new Livro ("Drácula", "Bram Stoker", true);
        Livro lv3 = new Livro ("Racionais Mc's", "Racionais Mc's", false);


           System.out.println("\n--- BIBLIOTECA ---");
           lv1.exibirFicha(1);
           lv2.exibirFicha(2);
           lv3.exibirFicha(3);
           System.out.println("Total de Livros: " + Livro.getTotalLivros());
           System.out.println("4 - Sair");
           System.out.print("\nEscolha um Livro ou 4 para Sair: ");


    }
}
