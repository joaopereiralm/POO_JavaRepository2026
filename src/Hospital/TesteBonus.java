package Hospital;

public class TesteBonus {
    public static void main(String[] args) {
        Medico m1 = new Medico("Helena");
        Medico m2 = new Medico("Roberto");
        Paciente p1 = new Paciente("Joana");
        Paciente p2 = new Paciente("Lucas");

        Consulta.marcar(m1, p1, "rotina");
        Consulta.marcar(m1, p2, "dor de cabeca");
        Consulta.marcar(m2, p1, "retorno");

        m1.listarPacientes();
        p1.listarMedicos();
    }
}
