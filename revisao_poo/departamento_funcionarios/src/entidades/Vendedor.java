package entidades;
import java.util.Scanner;

public class Vendedor extends Funcionario {
    private double horasExtras;
    private double valorVendas;

    public Vendedor(int codigo, String nome, int idade, double salarioBase, Departamento departamento) {
        super(codigo, nome, idade, salarioBase, departamento);
    }
    
    // Getters

    public double getHorasExtras() {
        return this.horasExtras;
    }

    public double valorVendas() {
        return this.valorVendas;
    }

    private double setHorasExtras(double horas) {
        return this.horasExtras = horas;
    }

    private double setValorVendas(double vendas) {
        return this.valorVendas = vendas;
    }

    // Métodos

    @Override
    public double calcularSalario(Scanner scanner) {
        System.out.print("Digite a quantidade de horas extras do vendedor: ");
        double horasExtras = scanner.nextDouble();
        scanner.nextLine();
        this.setHorasExtras(horasExtras);
                            
        System.out.print("Digite o valor de vendas realizadas pelo vendedor: ");
        double valorVendas = scanner.nextDouble();
        scanner.nextLine();
        this.setValorVendas(valorVendas);

        double salarioCalculado = getSalarioBase() + (horasExtras * 12.00) + (valorVendas * 0.05);
        System.out.println("Salário calculado para o vendedor: " + salarioCalculado);
        this.setHorasExtras(0);
        this.setValorVendas(0);

        return salarioCalculado;
    }
}
