package exercicio02;

public class TecnicoManutencao extends Funcionario {

    private double insalubridadeMensal;
    private double bonusAnual;

    public TecnicoManutencao(String nome, double salarioMensal, double insalubridadeMensal, double bonusAnual) {
        super(nome, salarioMensal);
        this.insalubridadeMensal = insalubridadeMensal;
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double salario(double anual) {
        anual = anual+insalubridadeMensal+bonusAnual;
        return super.salario(anual);
    }
}
