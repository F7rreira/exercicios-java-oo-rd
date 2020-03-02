package exercicio02;

public class Gerente extends Funcionario{

    private double bonusAnualVarialvel;

    public Gerente(String nome, double salarioMensal, double bonusAnualVarialvel) {
        super(nome, salarioMensal);
        this.bonusAnualVarialvel = bonusAnualVarialvel;
    }

    @Override
    public double salario(double anual) {
        anual += bonusAnualVarialvel;
        return super.salario(anual);
    }
}
