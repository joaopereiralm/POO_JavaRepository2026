package SistemaRH;

import java.util.Set;

public class FuncionarioApp {
    public static void main (String args[]){
        Funcionario funcionario1 = new Funcionario("João", 10.00, 10);
        Funcionario funcionario2 = new Funcionario();

        Gerente gerente1 = new Gerente("Lucas", 20.00, 10);
        Gerente gerente2 = new Gerente();

        Vendedor vendedor1 = new Vendedor("Jonas", 25.00, 10);
        Vendedor vendedor2 = new Vendedor();

        System.out.println("\n--- Dados do Funcionario ---");
        funcionario1.exibirDadosF();
        System.out.println("");
        funcionario2.exibirDadosF();

        System.out.println("\n--- Dados do Gerente ---");
        gerente1.exibirDadosF();
        System.out.println("");
        gerente2.exibirDadosF();

        System.out.println("\n--- Dados do Vendedor ---");
        vendedor1.setTotalVendas(10.00);
        vendedor1.exibirDadosF();
        System.out.println("");
        vendedor2.exibirDadosF();
    }
}