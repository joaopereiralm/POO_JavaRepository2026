package Mecanica;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, int ano, int numeroPortas) {
        super(marca, ano);              // constrói a parte de Veiculo
        this.numeroPortas = numeroPortas;
    }

    // exibirDados() é herdado - não precisa reescrever

    public int getNumeroPortas() {
        return numeroPortas;
    }
}
