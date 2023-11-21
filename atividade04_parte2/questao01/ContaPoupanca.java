package questao01;

public class ContaPoupanca {
    ContaBancaria contaBancaria;

    public ContaPoupanca(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public void sacar(double valor) {
        if (valor > 1000) {
            throw new
            RuntimeException("Não pode sacar mais de 1000 em uma poupança");
        }
        contaBancaria.sacar(valor);
    }
}

