import java.util.ArrayList;
import java.util.List;

// Seção 7 — Desafio integrador: folha de pagamento

interface Notificavel {
    void notificar(String mensagem);

    default void notificarAtraso() {
        notificar("Seu pagamento está atrasado");
    }
}

abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    void exibirFicha() {
        System.out.println("Nome: " + nome + " | Salário-base: R$ " + salarioBase);
    }

    abstract double calcularSalario();
}

class FuncionarioCLT extends Funcionario {
    FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    double calcularSalario() {
        return salarioBase + (salarioBase * 0.1);
    }
}

class FuncionarioPJ extends Funcionario implements Notificavel {
    FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("[PJ] " + mensagem);
    }
}

class Estagiario extends Funcionario implements Notificavel {
    Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    double calcularSalario() {
        return salarioBase * 0.8;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("[Estagiário] " + mensagem);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Funcionario> folha = new ArrayList<>();
        folha.add(new FuncionarioCLT("Carlos", 3000));
        folha.add(new FuncionarioPJ("Marina", 5000));
        folha.add(new Estagiario("Lucas", 1500));

        System.out.println("=== Folha de pagamento ===");
        for (Funcionario f : folha) {
            f.exibirFicha();
            System.out.println("Salário calculado: R$ " + f.calcularSalario());
            System.out.println();
        }

        List<Notificavel> notificaveis = new ArrayList<>();
        for (Funcionario f : folha) {
            if (f instanceof Notificavel) {
                notificaveis.add((Notificavel) f);
            }
        }

        System.out.println("=== Notificações de atraso ===");
        for (Notificavel n : notificaveis) {
            n.notificarAtraso();
        }
    }
}
