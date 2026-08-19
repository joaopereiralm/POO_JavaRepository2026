package SistemaEstoque;

import java.util.Scanner;

public class ProdutoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto1 = new Produto("Arroz", 5.00, 2);
        Produto produto2 = new Produto("Feijão", 5.00, 1);
        Produto produto3 = new Produto();
        double saldo = 0.0;
        int quantidade = 0;
        String opmenu;

        do {
            produto1.exibirDados(1);
            produto2.exibirDados(2);
            produto3.exibirDados(3);

            System.out.println("Total de produtos: " + Produto.getTotalProdutos());

            System.out.println("\n--- ESTOQUE ---");
            Produto.exibirDadosProdutos(produto1, produto2, produto3);
            System.out.println("Total de produtos: " + Produto.getTotalProdutos());
            System.out.println("\n1 - Vender");
            System.out.println("2 - Repor produto");
            System.out.println("3 - Sair");
            System.out.print("\nEscolha uma opção: ");
            int opcase = sc.nextInt();

            if (opcase <= 0 || opcase > 3) {
                System.out.println("Valor inválido");
            } else if (opcase == 3) {
                System.out.println("Programa finalizado");
                break;
            } else {

                switch (opcase) {
                    case 1:
                        System.out.println("\n--- VENDA ---");
                        System.out.println("Saldo do cliente: R$");
                        saldo = sc.nextDouble();
                        produto1.exibirDados(1);
                        produto2.exibirDados(2);
                        produto3.exibirDados(3);
                        System.out.println("\nSaldo do cliente: R$" + saldo);
                        System.out.println("Qual produto deseja vender? (Ex: 1):");
                        int opproduto = sc.nextInt();

                        switch (opproduto) {
                            case 1:
                                saldo = produto1.vender(saldo, 1);
                                break;
                            case 2:
                                saldo = produto2.vender(saldo, 1);
                                break;
                            case 3:
                                saldo = produto3.vender(saldo, 1);
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("\n--- REPOSIÇÃO ---");
                        Produto.exibirDadosProdutos(produto1, produto2, produto3);
                        System.out.println("Total de produtos: " + Produto.getTotalProdutos());
                        System.out.println("\nQual produto deseja repor? (Ex: 2):");
                        opproduto = sc.nextInt();
                        System.out.println("Quantas unidades deseja repor? :");
                        quantidade = sc.nextInt();

                        switch (opproduto) {
                            case 1:
                                produto1.repor(quantidade);
                            case 2:
                                produto2.repor(quantidade);
                            case 3:
                                produto3.repor(quantidade);
                        }
                        break;
                    default:
                        System.out.println("Valor inválido");
                        break;
                }
            }
            System.out.println("\nRetornar ao Menu?");
            System.out.println("S = Sim || N = Não: ");
            opmenu = sc.next();
        }while (opmenu.equalsIgnoreCase("Sim") || opmenu.equalsIgnoreCase("S")) ;
    }
}