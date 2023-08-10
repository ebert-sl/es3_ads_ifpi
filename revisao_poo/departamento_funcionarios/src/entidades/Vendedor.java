package entidades;

public class Vendedor extends Funcionario {
    private double horasExtras;
    private double valorVendas;

    public Vendedor(int codigo, String nome, int idade, double salarioBase, Departamento departamento) {
        super(codigo, nome, idade, salarioBase, departamento);
    }
    
    // Getters e Setters

    public double getHorasExtras() {
        return this.horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double valorVendas() {
        return this.valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    // Métodos
    
    public void adicionarHoras(double horas) {
        horasExtras += horas;
    }

    public void adicionarValorVendas(double vendas) {
        valorVendas += vendas;
    }

    public void realizarPagamento() {
        double salario = calcularSalario();
        System.out.println("Valor pago: " + salario);
        horasExtras = 0;
        valorVendas = 0;                                                                               //quando realizado o pagamento de um funcionario, as horas extras devem ser zeradas 
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * 12.00) + (valorVendas * 0.05);                                                //defini 12 reais como umm valor padrao para horas extras, mas pode ser alterado
    }
}
