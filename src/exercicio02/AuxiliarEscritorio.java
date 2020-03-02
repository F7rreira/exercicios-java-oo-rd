package exercicio02;

public class AuxiliarEscritorio extends Funcionario {

    private double bonusAnual;

    public AuxiliarEscritorio(String nome, double salarioMensal, double bonusAnual) {
        super(nome, salarioMensal);
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double salario(double anual) {
        anual+= bonusAnual;
        return super.salario(anual);
    }
}
