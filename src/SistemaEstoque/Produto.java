package SistemaEstoque;

public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEstoque;
    public static int totalProdutos = 0;

    public Produto () {this ("Sem nome", 0.00, 0);}
    public Produto (String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        totalProdutos++;
    }
    public static int getTotalProdutos(){return totalProdutos;}

    //métodos de instância
    public void vender (int quantidade){
        if (quantidadeEstoque >= 0){
            this.quantidadeEstoque -= 1;
        }
        else{
            System.out.println("Estoque insuficiente");
        }
    }

    public void repor (int quantidade){
        this.quantidadeEstoque += 1;
    }
    public void exibirDados (int ContadorProdutos){

        System.out.println(ContadorProdutos + " " + "|Nome: " + this.nome + "|" +
                " |Preço: R$" + this.preco + "|" +
                " |" + "Estoque: " + this.quantidadeEstoque + "|");

    }

    public static boolean exibirDadosProdutos(Produto produto1, Produto produto2, Produto produto3) {
        produto1.exibirDados(1);
        produto2.exibirDados(2);
        produto3.exibirDados(3);
        return false;
    }
}
