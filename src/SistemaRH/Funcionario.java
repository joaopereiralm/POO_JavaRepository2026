package SistemaRH;

public class Funcionario {

    protected String nome;
    protected double salario;
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

    public double calcularBonus(){
        return this.salario * 0.15;
    }

    public void exibirDadosF(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("Carga Horária Semanal: " + this.cargaHorariaSemanal);
        System.out.println("Bônus: " + calcularBonus());
        System.out.println("Total a receber: " + this.calcularBonus() + this.salario);
    }
}

