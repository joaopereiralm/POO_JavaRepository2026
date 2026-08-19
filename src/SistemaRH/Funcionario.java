package SistemaRH;

public class Funcionario {

    private String nome;
    private double salario;
    private int cargaHorariaSemanal;

    public  Funcionario (){this ("Sem nome", 0.00, 1);}
    public Funcionario(String nome, double salario, int cargaHorariaSemanal){
        setNome(nome);
        setSalario(salario);
        setCargaHorariaSemanal(cargaHorariaSemanal);
    }

    //Getters
    public int getCargaHorariaSemanal() {return cargaHorariaSemanal;}
    public double getSalario() {return salario;}
    public String getNome() {return nome;}

    public void setNome(String nome) {
        if (nome == null || nome.length() > 50){
            System.out.println("[AVISO]: Nome informado é INVÁLIDO!");
        }
        else {
            this.nome = nome;
        }
    }

    public void setSalario(double salario) {
        if (salario < 0.00){
            System.out.println("[AVISO]: Salário informado é INVÁLIDO!");
        }
        else {
            this.salario = salario;
        }
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        if (cargaHorariaSemanal < 1 || cargaHorariaSemanal > 44){
            System.out.println("[AVISO]: Carga horária informado é INVÁLIDO!");
        }
        else {
            this.cargaHorariaSemanal = cargaHorariaSemanal;
        }
    }

    public void exibirDadosF(){
        System.out.println("\n--- Dados do Funcionário ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Carga Horária Semanal: " + getCargaHorariaSemanal());
    }
}

