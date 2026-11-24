// Exercícios 6.2 e 6.3 — Interface Notificavel (com método default)

interface Notificavel {
    void notificar(String mensagem);

    default void notificarComHorario(String mensagem) {
        System.out.print("[10:32] ");
        notificar(mensagem);
    }
}

class EmailService implements Notificavel {
    @Override
    public void notificar(String mensagem) {
        System.out.println("[EMAIL] " + mensagem);
    }
}

class SmsService implements Notificavel {
    @Override
    public void notificar(String mensagem) {
        System.out.println("[SMS] " + mensagem);
    }
}

class PushService implements Notificavel {
    @Override
    public void notificar(String mensagem) {
        System.out.println("[PUSH] " + mensagem);
    }
}

public class Main {
    public static void main(String[] args) {
        Notificavel[] servicos = { new EmailService(), new SmsService(), new PushService() };

        System.out.println("--- 6.2: notificar ---");
        for (Notificavel n : servicos) {
            n.notificar("Olá, mundo!");
        }

        System.out.println("--- 6.3: notificarComHorario (herdado do default) ---");
        for (Notificavel n : servicos) {
            n.notificarComHorario("Olá, mundo!");
        }
    }
}
