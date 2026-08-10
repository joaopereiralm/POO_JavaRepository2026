package Biblioteca;

public class Livro {
    //atributos
    static int TotalLivros = 0;

    public String titulo;
    public String autor;
    public boolean disponivel;

    public Livro() {
        this("Sem título", "Sem autor");
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        TotalLivros++;
    }

    public static int getTotalLivros() {
        return TotalLivros;
    }

    //construtores
    public void emprestar(int numero) {
        //vai verificar se o livro está disponível
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("\nLivro emprestado com sucesso!");
            exibirFicha(numero); //vai deixar o livro em falso, pois está emprestado.
        } else {
            System.out.println("\nEste livro já foi emprestado");
            exibirFicha(numero);
        }
    }

    public void devolver(int numero) {
        //vai verificar se o livro está disponível
        if (!this.disponivel) {
            this.disponivel = true; //atualiza de emprestado para devolvido
            System.out.println("\nLivro devolvido com sucesso!");
            exibirFicha(numero); //exibe a ficha como devolvido
        } else {
            System.out.println("\nEste livro já está disponível na biblioteca:");
            exibirFicha(numero);
        }
    }

    public void exibirFicha(int ContadorLivros) {
        //tornando boolean em String para que possa ficar melhor visívelmente.
        String status;

        //caso dados forem vazio vai retornar indisponível.
        if ((this.titulo == null || this.titulo.trim().isEmpty() || this.titulo.equals("Sem título")) &&
                (this.autor == null || this.autor.trim().isEmpty() || this.autor.equals("Sem autor"))) {
            status = "Indisponível";
        } else {
            status = this.disponivel ? "Disponível" : "Emprestado";
        }
        System.out.println(ContadorLivros + " " + "|Titulo: " + this.titulo + "|" +
                " |Autor: " + this.autor + "|" +
                " |" + status + "|");
    }

    //exibe todos os livros com uma classe
    public static boolean exibirMenuLivros(Livro l1, Livro l2, Livro l3) {
        l1.exibirFicha(1);
        l2.exibirFicha(2);
        l3.exibirFicha(3);
        return false;
    }

    //exibe livros emprestados
    public static void exibirLivrosEmprestados(Livro l1, Livro l2, Livro l3) {
        if (!l1.disponivel) {
            l1.exibirFicha(1);
        } else if (!l2.disponivel) {
            l2.exibirFicha(2);
        } else if (!l3.disponivel) {
            l3.exibirFicha(3);
        }
    }
}
