package Hospital;

import java.time.LocalDateTime;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private LocalDateTime dataConsulta;

    public Consulta(Medico medico, Paciente paciente, String motivo) {
        this.medico = medico;
        this.paciente = paciente;
        this.motivo = motivo;
        this.dataConsulta = LocalDateTime.now();
    }

    public Medico getMedico() { return medico; }
    public Paciente getPaciente() { return paciente; }
    public String getMotivo() { return motivo; }
    public LocalDateTime getDataConsulta() { return dataConsulta; }

    public static Consulta marcar(Medico medico, Paciente paciente, String motivo) {
        Consulta consulta = new Consulta(medico, paciente, motivo);
        medico.adicionarConsulta(consulta);
        paciente.adicionarConsulta(consulta);
        return consulta;
    }
}
