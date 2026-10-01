package Casa;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, String rua, String cidade) {
        this.nome = nome;
        this.endereco = new Endereco(rua, cidade);   // nasce junto com a pessoa - composição
    }

    public void exibir() {
        System.out.println(nome + " mora em " + endereco.getRua() + ", " + endereco.getCidade());
    }
}
