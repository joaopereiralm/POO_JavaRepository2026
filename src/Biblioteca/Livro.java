package Biblioteca;

public class Livro {
//atributos
    static int TotalLivros = 0;

    public String titulo;
    public String autor;
    public boolean disponivel;

    public Livro () {
        this ("Sem título", "Sem autor", true);
    }
    public Livro (String titulo, String autor, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        TotalLivros++;
    }

    public static int getTotalLivros(){
        return TotalLivros;
    }

    //construtores
    public void emprestar(){
        //vai verificar se o livro está disponível
        if (this.disponivel){
            System.out.println("O livro está disponível");
            this.disponivel = false;//vai deixar o livro em falso, pois está emprestado.
        }
        else {
            System.out.println("Indisponível");
        }
    }

    public void devolver () {
        //vai verificar se o livro está disponível
        if (!this.disponivel) {
            System.out.println("O livro foi emprestado");
            this.disponivel = true;//vai deixar o livro em true, pois está sendo devolvido.
        } else {
            System.out.println("Disponível");
        }
    }

    public void exibirFicha(int ContadorLivros){
        //tornando boolean em String para que possa ficar melhor visívelmente.
        String status;
        if (this.disponivel) {
            status = "Disponível";
        } else {
            status = "Indisponível";
        }
        System.out.println(ContadorLivros + " " + "|Titulo: " + this.titulo + "|" +
                " |Autor: " + this.autor + "|" +
                " |" + status + "|");
    }
}
