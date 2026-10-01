package Casa;

// DESAFIO BÔNUS
// Escolhi COMPOSIÇÃO: um Endereco descreve onde UMA pessoa mora; sem a Pessoa
// ele não faz sentido sozinho e morre junto com ela.
//
// UML:   Pessoa ◆───────── Endereco
//               1        1
public class Endereco {
    private String rua;
    private String cidade;

    Endereco(String rua, String cidade) {   // visibilidade de pacote
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }
}
