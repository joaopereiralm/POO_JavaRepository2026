import java.util.Scanner;
public class TestaCB {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //contas bancárias já existentes
        ContaBancaria cb1 = new ContaBancaria("Jonas Pereira", "1003", 00.00);
        ContaBancaria cb2 = new ContaBancaria("Ana Souza", "1001", 1000.00);
        ContaBancaria cb3 = new ContaBancaria("Carlos Lima", "1000", 150.00);

        int op = 0;

        while(op != 4){
            System.out.println("\n--- MENU BANCÁRIO ---");
            System.out.println("1 - Consulta Saldo / Conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            int contaop = 0;
            switch (op) {
                case 1:
                    switch (contaop) {
                        System.out.println("\n--- SELECIONE A CONTA ---");
                        System.out.println("1 - Conta 1 (" + cb1.titular + ")");
                        System.out.println("2 - Conta 2 (" + cb2.titular + ")");
                        System.out.println("3 - Conta 3 (" + cb3.titular + ")");
                        System.out.print("Digite o número da conta: ");
                        contaop = sc.nextInt();
                    }

            }
                switch (contaop){
                    case 1:
                        System.out.println("\n--- CONSULTA DADOS ---");
                        cb1.ExibirCB();
                        System.out.println("Retornar ao Menu?");

                        System.out.println("Selecione uma conta bancária: ");
                        double op2 = sc.nextDouble();
                }
            }
        }


        //chama os dados da contabancaria e coloca no this.

        //dados cb1
        cb1.ExibirCB();
        cb1.saque(150.0);
        cb1.depositar(20.0);
        //dados cb2
        cb2.saque(200.00);
        cb2.depositar(200.00);
        cb2.ExibirCB();
        //dados cb3
        cb3.saque(00.0);
        cb2.depositar(00.0);
        cb3.ExibirCB();
    }
}
