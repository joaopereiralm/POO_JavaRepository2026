package Casa;

import java.util.ArrayList;

// COMPOSIÇÃO: os Comodos nascem junto com a Casa
public class Casa {
    private String endereco;
    private ArrayList<Comodo> comodos;

    public Casa(String endereco) {
        this.endereco = endereco;
        this.comodos = new ArrayList<>();
        // os cômodos são criados aqui dentro - composição
        // (não existe nenhum método que aceite um Comodo pronto vindo de fora)
        this.comodos.add(new Comodo("Sala", 20.0));
        this.comodos.add(new Comodo("Cozinha", 12.5));
        this.comodos.add(new Comodo("Quarto", 14.0));
    }

    public void listarComodos() {
        System.out.println("Comodos da casa em " + endereco + ":");
        for (Comodo comodo : comodos) {
            System.out.println("- " + comodo.getNome() + " (" + comodo.getAreaM2() + " m2)");
        }
    }
}
