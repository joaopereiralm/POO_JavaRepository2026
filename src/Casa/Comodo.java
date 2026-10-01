package Casa;

public class Comodo {
    private String nome;
    private double areaM2;

    // construtor com visibilidade de pacote (sem public): fora do pacote
    // ninguém consegue criar um Comodo solto, sem estar dentro de uma Casa
    Comodo(String nome, double areaM2) {
        this.nome = nome;
        this.areaM2 = areaM2;
    }

    public String getNome() {
        return nome;
    }

    public double getAreaM2() {
        return areaM2;
    }
}
