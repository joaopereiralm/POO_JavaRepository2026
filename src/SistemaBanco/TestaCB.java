package SistemaBanco;

import java.util.Scanner;

public class TestaCB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //contas bancárias já existentes
        ContaBancaria cb1 = new ContaBancaria("Jonas Pereira", "1003", 00.00);
        ContaBancaria cb2 = new ContaBancaria("Ana Souza", "1001", 1000.00);
        ContaBancaria cb3 = new ContaBancaria("Carlos Lima", "1000", 150.00);

        int op = 0;
        String opstring; //String de opção para retornar ao menu bancário ou não.

        do {
            //menu de escolhas
            System.out.println("\n--- MENU BANCÁRIO ---");
            System.out.println("1 - Consulta Saldo / Conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            if (op <= 0 || op > 4) {
                System.out.println("Valor inválido");
            } else if (op == 4) {
                break;
            }
            else {

                //menu de contas após escolha realizada pelo usuário
                System.out.println("\n--- SELECIONE A CONTA ---");
                System.out.println("1 - Conta 1 (" + cb1.titular + ")");
                System.out.println("2 - Conta 2 (" + cb2.titular + ")");
                System.out.println("3 - Conta 3 (" + cb3.titular + ")");
                System.out.print("Digite o número da conta: ");
                int contaop = sc.nextInt();

                double valorDeposito = 0;
                double valorSaque = 0;

                switch (op) {
                    //Case de consulta
                    case 1:
                        System.out.println("\n--- CONSULTA DADOS ---");
                        switch (contaop) {
                            case 1:
                                cb1.ExibirCB();
                                break;

                            case 2:
                                cb2.ExibirCB();
                                break;

                            case 3:
                                cb3.ExibirCB();
                                break;

                            default:
                                System.out.println("Número inválido");
                        }
                        break;
                    //Case de depósito
                    case 2:
                        System.out.println("\n--- DEPÓSITO BANCÁRIO ---");
                        switch (contaop) {
                            case 1:
                                System.out.println("Saldo atual: R$" + cb1.saldo);
                                System.out.println("\nValor do depósito: R$");
                                valorDeposito = sc.nextDouble();

                                cb1.depositar(valorDeposito);

                                System.out.println("\nSaldo atual: R$" + cb1.saldo);
                                break;

                            case 2:
                                System.out.println("Saldo atual: R$" + cb2.saldo);
                                System.out.println("\nValor do depósito R$: ");
                                valorDeposito = sc.nextDouble();

                                cb2.depositar(valorDeposito);

                                System.out.println("Saldo atual R$: " + cb2.saldo);
                                break;

                            case 3:
                                System.out.println("Saldo atual: R$" + cb3.saldo);
                                System.out.println("\nValor do depósito R$: ");
                                valorDeposito = sc.nextDouble();

                                cb3.depositar(valorDeposito);

                                System.out.println("Saldo atual R$: " + cb3.saldo);
                                break;
                        }
                        break;
                    //Case de saque
                    case 3:
                        switch (contaop) {
                            case 1:
                                System.out.println("\nSaldo atual: R$" + cb1.saldo);
                                System.out.println("\nValor do saque R$: ");
                                valorSaque = sc.nextDouble();

                                cb1.saque(valorSaque);

                                System.out.println("Saldo atual R$: " + cb1.saldo);
                                break;

                            case 2:
                                System.out.println("Saldo atual: R$" + cb2.saldo);
                                System.out.println("\nValor do saque R$: ");
                                valorSaque = sc.nextDouble();

                                cb2.saque(valorSaque);

                                System.out.println("Saldo atual R$: " + cb2.saldo);
                                break;

                            case 3:
                                System.out.println("Saldo atual: R$" + cb3.saldo);
                                System.out.println("\nValor do saque R$: ");
                                valorSaque = sc.nextDouble();

                                cb3.saque(valorSaque);

                                System.out.println("Saldo atual R$: " + cb3.saldo);
                                break;
                        }
                    case 4:
                        break;
                }
            }
            System.out.println("\n--- RETORNAR AO MENU? ---");
            System.out.println("S == Sim || N == Não");
            opstring = sc.next();
        } while (opstring.equalsIgnoreCase("S") || opstring.equalsIgnoreCase("Sim"));
        System.out.println("Programa finalizado");
    }


    //chama os dados da contabancaria e coloca no this.

//        //dados cb1
//        cb1.ExibirCB();
//        cb1.saque(150.0);
//        cb1.depositar(20.0);
//        //dados cb2
//        cb2.saque(200.00);
//        cb2.depositar(200.00);
//        cb2.ExibirCB();
//        //dados cb3
//        cb3.saque(00.0);
//        cb2.depositar(00.0);
//        cb3.ExibirCB();
}
