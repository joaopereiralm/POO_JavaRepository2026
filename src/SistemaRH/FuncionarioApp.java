package SistemaRH;

public class FuncionarioApp {
    public static void main (String args[]){
        Funcionario funcionario1 = new Funcionario("João", 10.00, 0);
        Funcionario funcionario2 = new Funcionario();

        funcionario2.setCargaHorariaSemanal(10);
        funcionario2.setSalario(550.00);
        funcionario2.setNome("Jonas");

        funcionario1.exibirDadosF();
        funcionario2.exibirDadosF();
    }
}
