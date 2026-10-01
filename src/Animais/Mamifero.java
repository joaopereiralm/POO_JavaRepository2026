package Animais;

public class Mamifero extends Animal {

    public Mamifero(String nome) {
        super(nome);
    }

    @Override
    public String descrever() {
        return super.descrever() + ", mamifero (amamenta os filhotes)";
    }
}
