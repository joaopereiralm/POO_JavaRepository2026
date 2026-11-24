// Exercício 6.4 — Classe abstrata + interface

interface Desenhavel {
    void desenhar();
}

abstract class FormaGeometrica implements Desenhavel {
    protected String nome;

    FormaGeometrica(String nome) {
        this.nome = nome;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando: " + nome);
    }

    abstract double calcularPerimetro();
}

class Quadrado extends FormaGeometrica {
    private double lado;

    Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    @Override
    double calcularPerimetro() {
        return 4 * lado;
    }
}

class Triangulo extends FormaGeometrica {
    private double a, b, c;

    Triangulo(double a, double b, double c) {
        super("Triângulo");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calcularPerimetro() {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = { new Quadrado(5), new Triangulo(3, 4, 5) };

        for (FormaGeometrica f : formas) {
            f.desenhar(); // herdado, não reimplementado
            System.out.println("Perímetro: " + f.calcularPerimetro());
        }
    }
}
