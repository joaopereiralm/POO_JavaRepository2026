package SistemaRH;

public class Vendedor extends Funcionario{
    private double totalVendas;
    public double bonusVendedor;

    public Vendedor(){this("Sem nome", 0.00, 0);}

    public Vendedor(String nome, double salario, int cargaHorariaSemanal){
        super(nome, salario, cargaHorariaSemanal);
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularBonus(){
        return this.totalVendas * 0.10;
    }

    @Override
    public void exibirDadosF(){
        super.exibirDadosF();
        System.out.println("Total vendas: " + this.totalVendas);
    }
}