package entidades;
import java.util.Scanner;

public class Gerente extends Funcionario {
    private double bonificacao;

    public Gerente(int codigo, String nome, int idade, double salarioBase, Departamento departamento) {
        super(codigo, nome, idade, salarioBase, departamento);
    }

    // Getters

    public double getBonificacao() {
        return this.bonificacao;
    }

    private void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    // Métodos
    
    @Override
    public double calcularSalario(Scanner scanner) {            
        System.out.print("Digite a bonificação desejada (em decimal, por exemplo, 0,1 para 10%): ");
        double bonificacao = scanner.nextDouble();
        scanner.nextLine();
        this.setBonificacao(bonificacao);
        
        double salarioCalculado = getSalarioBase() + (getSalarioBase() * bonificacao);
        System.out.println("Salário calculado para o gerente: " + salarioCalculado);
        this.setBonificacao(0);
        return salarioCalculado;
    }
}
