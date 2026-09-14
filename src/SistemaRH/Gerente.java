package SistemaRH;

public class Gerente extends Funcionario{
    private double bonusGerente;
    public Gerente() {this("Sem nome", 0.00, 0);}

    public Gerente(String nome, double salario, int cargaHorariaSemanal) {
        super(nome, salario, cargaHorariaSemanal);
        this.bonusGerente = bonusGerente;
    }

    public double getBonusGerente() {
        return bonusGerente;
    }

    public void setBonusGerente(double bonusGerente) {
        this.bonusGerente = bonusGerente;
    }

    @Override
    public double calcularBonus(){
        return super.calcularBonus() + this.bonusGerente;
    }

    @Override
    public void exibirDadosF(){
        super.exibirDadosF();
        System.out.println("Bônus gerencial: " + this.bonusGerente);
    }
}
