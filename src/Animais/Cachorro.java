package Animais;

public class Cachorro extends Mamifero {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String descrever() {
        return super.descrever() + " e late";
    }
}
