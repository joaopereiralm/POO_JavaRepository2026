public class ContaBancaria{
    //variaveis de classe
    public static int totalContas = 0;
    public static final double TAXA_MANUTENCAO = 12.0;

    //variáveis de instância
    public String titular;
    public String numero;
    public double saldo;

    //métodos construtores
    //sobrecarga de métodos construtores
    public ContaBancaria(){
        this("Sem titular", "0000", 0);
    }
    public ContaBancaria(String titular, String numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        totalContas++;
    }
    public void  depositar(double valor){
        if (valor >= 0){
            System.out.println("Valor depositado: R$" + valor);
            this.saldo += valor;
        }
        else{
            System.out.println("Valor inválido");
        }
    }
    public void saque(double valor){
        if (valor >= saldo)
            System.out.println("Valor sacado: " + valor);
        this.saldo -= valor;
    }
    public void ExibirCB(){
        //this representa  objeto que chama o metodo
        System.out.println("Titular: " + this.titular +
                " Número: " + this.numero +
                " Saldo R$: " + this.saldo);
    }
}