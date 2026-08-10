package Biblioteca;

import java.util.Scanner;

import static Biblioteca.Livro.exibirLivrosEmprestados;
import static Biblioteca.Livro.exibirMenuLivros;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro lv1 = new Livro("Devoradores de Estrelas", "Andy Weir", true);
        Livro lv2 = new Livro("Drácula", "Bram Stoker", true);
        Livro lv3 = new Livro("Racionais Mc's", "Racionais Mc's", false);

        int opcase = 0;

       do {
           System.out.println("\n--- BIBLIOTECA ---");
           exibirMenuLivros(lv1, lv2, lv3);
           System.out.println("Total de Livros: " + Livro.getTotalLivros());
           System.out.println("\n1 - Devolver Livro");
           System.out.println("2 - Emprestar Livro");
           System.out.println("3 - Sair");
           System.out.print("\nEscolha uma opção: ");
           opcase = sc.nextInt();

           switch (opcase) {
               //case de devolução
               case 1:
                   System.out.println("\n--- DEVOLUÇÃO ---");
                   System.out.println("Livros não devolvidos:");
                   //verificação de qual livro disponível
                   Livro.exibirLivrosEmprestados(lv1, lv2, lv3);

                   System.out.println("\nQual livro deseja devolver? (Ex: 1)");
                   System.out.println("R: ");
                   int opdevolucao = sc.nextInt();

                   if (opdevolucao == 1) {
                       lv1.devolver(1);
                   } else if (opdevolucao == 2) {
                       lv2.devolver(2);
                   } else if (opdevolucao == 3) {
                       lv3.devolver(3);
                   }
                   break;

               //case de empréstimo
               case 2:
                   System.out.println("\n--- EMPRÉSTIMO ---");
                   System.out.println("Livros Disponíveis:");

                   if (lv1.disponivel) lv1.exibirFicha(1);
                   if (lv2.disponivel) lv2.exibirFicha(2);
                   if (lv3.disponivel) lv3.exibirFicha(3);

                   System.out.println("\nQual livro deseja emprestar? (Ex: 1)");
                   System.out.println("R: ");
                   int opemprestimo = sc.nextInt();

                   if (opemprestimo == 1) {
                       lv1.emprestar(1);
                   } else if (opemprestimo == 2) {
                       lv2.emprestar(2);
                   } else if (opemprestimo == 3) {
                       lv3.emprestar(3);
                   }
                   break;

               case 3:
                   System.out.println("Programa finalizado");
                   break;

               default:
                   System.out.println("Valor inválido");
                   break;
           }
       }while (opcase != 3);
    }
}
