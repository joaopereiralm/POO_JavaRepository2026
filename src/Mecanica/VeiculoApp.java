package Mecanica;

public class VeiculoApp {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Fiat", "Uno");
        Veiculo v2 = new Veiculo("Honda", "CG 160");
        Veiculo v3 = new Veiculo();

        v1.ligar();
        v1.ligar();
        v2.ligar();
        v2.desligar();

        v1.exibirFicha();
        v2.exibirFicha();
        v3.exibirFicha();

        System.out.println("Total de veiculos: " + Veiculo.getTotalVeiculos());
    }
}
