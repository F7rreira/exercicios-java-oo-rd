package exercicio02;

public abstract class Funcionario {
    private String nome;
    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public double salario (double anual){
    anual= salarioMensal*13;
    return anual;
    }
}
