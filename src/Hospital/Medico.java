package Hospital;

import java.util.ArrayList;

// DESAFIO BÔNUS: Medico <-> Paciente via Consulta (N:N)
//
// UML:   Medico 1 ───── * Consulta * ───── 1 Paciente
// Atributos do vínculo (não são do médico nem do paciente): data e motivo.
public class Medico {
    private String nome;
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public Medico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void listarPacientes() {
        System.out.println("Pacientes do(a) Dr(a). " + nome + ":");
        for (Consulta c : consultas) {
            System.out.println("- " + c.getPaciente().getNome() + " (" + c.getMotivo() + ")");
        }
    }
}
