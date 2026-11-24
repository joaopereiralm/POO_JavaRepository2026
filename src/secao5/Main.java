// Exercício 5.2 — Do UML para o código

interface Autenticavel {
    boolean autenticar();
}

abstract class Usuario {
    protected String login;

    Usuario(String login) {
        this.login = login;
    }

    void exibirLogin() {
        System.out.println("Login: " + login);
    }
}

class Cliente extends Usuario implements Autenticavel {
    Cliente(String login) {
        super(login);
    }

    @Override
    public boolean autenticar() {
        System.out.println("Cliente " + login + " autenticado");
        return true;
    }
}

class Administrador extends Usuario implements Autenticavel {
    Administrador(String login) {
        super(login);
    }

    @Override
    public boolean autenticar() {
        System.out.println("Administrador " + login + " autenticado");
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Usuario[] usuarios = { new Cliente("joao"), new Administrador("admin") };
        for (Usuario u : usuarios) {
            u.exibirLogin();
            if (u instanceof Autenticavel) {
                ((Autenticavel) u).autenticar();
            }
        }
    }
}
