package Mecanica;

// DESAFIO BÔNUS: mesmo roteiro, cenário novo (Veiculo)
public class Veiculo {

    static int totalVeiculos = 0;          // variável de classe contadora

    String marca;
    String modelo;
    boolean ligado;

    public Veiculo() {
        this("Marca desconhecida", "Modelo desconhecido");
    }

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
        totalVeiculos++;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(modelo + " ligado.");
        } else {
            System.out.println(modelo + " ja estava ligado.");
        }
    }

    public void desligar() {
        ligado = false;
        System.out.println(modelo + " desligado.");
    }

    public void exibirFicha() {
        System.out.println(marca + " " + modelo + " - " + (ligado ? "ligado" : "desligado"));
    }

    public static int getTotalVeiculos() {
        return totalVeiculos;
    }
}
