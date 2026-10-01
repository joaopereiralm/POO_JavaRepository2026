package Hospital;

import java.util.ArrayList;

public class Paciente {
    private String nome;
    private ArrayList<Consulta> consultas = new ArrayList<>();

    public Paciente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void listarMedicos() {
        System.out.println("Medicos de " + nome + ":");
        for (Consulta c : consultas) {
            System.out.println("- " + c.getMedico().getNome() + " (" + c.getMotivo() + ")");
        }
    }
}
