package Animais;

// DESAFIO BÔNUS: hierarquia de 3 níveis
//
// UML:   Animal ◁──── Mamifero ◁──── Cachorro
public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String descrever() {
        return nome + " e um animal";
    }
}
