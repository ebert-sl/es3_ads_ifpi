package questao01;

public class ContaBancaria {
    private double saldo;
    
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor) { saldo += valor; }
    public void sacar(double valor) { saldo -= valor; }
}
