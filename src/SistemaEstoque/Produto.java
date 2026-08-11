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
    public double vender (double saldoAtual, int quantidade){

        if (this.quantidadeEstoque < quantidade){
            System.out.println("Estoque insuficiente");
            return saldoAtual;
        }

        double valorTotal = this.preco * quantidade;

        if (saldoAtual < valorTotal){
            System.out.println("Saldo insuficiente! Valor da compra: R$" + valorTotal + " | Seu saldo: R$" + saldoAtual);
            return saldoAtual;
        }

        else {
            // se tem estoque e saldo suficiente:
            this.quantidadeEstoque -= quantidade;
            saldoAtual -= valorTotal; // Deduz o valor do saldo
            System.out.println("Venda de " + quantidade + "x " + this.nome + " realizada com sucesso!");
            System.out.println("Novo saldo: R$" + saldoAtual);

            return saldoAtual; // Retorna o novo saldo atualizado
        }
    }

    public void repor (int quantidade){
        this.quantidadeEstoque += quantidade;
    }
    public void exibirDados (int ContadorProdutos){

        System.out.println(ContadorProdutos + " " + "|Nome: " + this.nome + "|" +
                " |Preço: R$" + this.preco + "|" +
                " |" + "Estoque: " + this.quantidadeEstoque + "|");

    }

    public static void exibirDadosProdutos(Produto produto1, Produto produto2, Produto produto3) {
        produto1.exibirDados(1);
        produto2.exibirDados(2);
        produto3.exibirDados(3);
    }
}