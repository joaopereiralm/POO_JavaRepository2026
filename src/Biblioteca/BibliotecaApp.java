package Biblioteca;
import java.util.Scanner;
import static Biblioteca.Livro.exibirMenuLivros;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro lv1 = new Livro("Devoradores de Estrelas", "Andy Weir", true);
        Livro lv2 = new Livro("Drácula", "Bram Stoker", true);
        Livro lv3 = new Livro("Racionais Mc's", "Racionais Mc's", false);


        System.out.println("\n--- BIBLIOTECA ---");
        exibirMenuLivros(lv1, lv2, lv3);
        System.out.println("Total de Livros: " + Livro.getTotalLivros());
        System.out.println("\n1 - Devolver Livro");
        System.out.println("2 - Emprestar Livro");
        System.out.println("3 - Sair");
        System.out.print("\nEscolha uma opção: ");
        int opcase = sc.nextInt();

        switch (opcase) {
            case 1:
                System.out.println("\n--- DEVOLUÇÃO ---");
                System.out.println("Livros não devolvidos:");
                if(exibirMenuLivros(lv1, lv2, lv3) != true){

                }
        }
    }
}
