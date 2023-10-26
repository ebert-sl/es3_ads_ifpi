package q05;

public class Deposito implements Operacao {
    @Override
    public double calcularTaxas(Transacao transacao) {
        return transacao.getValor() * 0.01;
    }
}
