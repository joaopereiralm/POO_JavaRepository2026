package SistemaEstoque;

import static SistemaEstoque.Produto.exibirDadosProdutos;

public class ProdutoApp {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 5.00, 2);
        Produto produto2 = new Produto("Feijão", 5.00, 1);
        Produto produto3 = new Produto();

        produto1.exibirDados(1);
        produto2.exibirDados(2);
        produto3.exibirDados(3);

        System.out.println("Total de produtos: " + Produto.getTotalProdutos());

        System.out.println("\n--- ESTOQUE ---");
        exibirD(produto1, produto2, produto3);
        System.out.println("Total de Livros: " + Produto.getTotalProdutos());
        System.out.print("\nEscolha uma opção: ");
        opcase = sc.nextInt();
    }
}