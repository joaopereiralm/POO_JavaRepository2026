// Seção 4 — Complete o código (lacunas preenchidas)

// 4.1 — classe que não pode ser instanciada, com método obrigatório
abstract class Funcionario {
    protected String nome;

    Funcionario(String nome) {
        this.nome = nome;
    }

    abstract double calcularSalario(); // sem corpo
}

// 4.2 — contrato
interface Estoque {
    void adicionar(String item);
    void remover(String item);
}

class EstoqueLocal implements Estoque {
    public void adicionar(String item) { System.out.println("Adicionado: " + item); }
    public void remover(String item) { System.out.println("Removido: " + item); }
}

// 4.3 — método pronto na interface (default)
interface Repositorio {
    void salvar(Object obj);

    default void listarTodos() {
        System.out.println("Listando...");
    }
}

class RepositorioMemoria implements Repositorio {
    public void salvar(Object obj) { System.out.println("Salvo: " + obj); }
}

// 4.4 — Gerente estende Funcionario e implementa o método herdado
class Gerente extends Funcionario {
    private double bonus;

    Gerente(String nome, double bonus) {
        super(nome);
        this.bonus = bonus;
    }

    @Override
    double calcularSalario() {
        return 3000 + bonus;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario g = new Gerente("Ana", 500);
        System.out.println(g.nome + ": " + g.calcularSalario());

        Estoque e = new EstoqueLocal();
        e.adicionar("Caneta");
        e.remover("Caneta");

        Repositorio r = new RepositorioMemoria();
        r.salvar("Registro 1");
        r.listarTodos();
    }
}
