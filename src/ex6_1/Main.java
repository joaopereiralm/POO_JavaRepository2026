// Exercício 6.1 — Classe abstrata Veiculo

abstract class Veiculo {
    protected String placa;

    Veiculo(String placa) {
        this.placa = placa;
    }

    abstract double calcularImposto();

    void exibirPlaca() {
        System.out.println("Placa: " + placa);
    }
}

class Carro extends Veiculo {
    Carro(String placa) {
        super(placa);
    }

    @Override
    double calcularImposto() {
        return 50000.0 * 0.04; // 4% sobre o valor do veículo
    }
}

class Moto extends Veiculo {
    Moto(String placa) {
        super(placa);
    }

    @Override
    double calcularImposto() {
        return 600.0 + 120.0; // valor fixo + taxa
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = {
            new Carro("ABC-1234"),
            new Moto("XYZ-9876"),
            new Carro("DEF-5678"),
            new Moto("GHI-4321")
        };

        for (Veiculo v : veiculos) {
            v.exibirPlaca();
            System.out.println("Imposto: R$ " + v.calcularImposto());
        }
    }
}
