package entidades;

public class Gerente extends Funcionario {
    private double bonificacao;

    public Gerente(int codigo, String nome, int idade, double salarioBase, Departamento departamento) {
        super(codigo, nome, idade, salarioBase, departamento);
    }

    // Getters e Setters

    public double getBonificacao() {
        return this.bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    // Métodos
    
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * bonificacao);
    }
}
