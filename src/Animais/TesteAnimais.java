package Animais;

import java.util.ArrayList;

public class TesteAnimais {
    public static void main(String[] args) {
        // coleção do tipo da superclasse mais genérica
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Animal("Ser vivo"));
        animais.add(new Mamifero("Baleia"));
        animais.add(new Cachorro("Rex"));

        for (Animal a : animais) {
            System.out.println(a.descrever());   // despacho dinâmico
        }
    }
}
