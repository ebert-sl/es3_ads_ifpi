package q05;

public class Transferencia implements Operacao {
    @Override
    public double calcularTaxas(Transacao transacao) {
        return transacao.getValor() * 0.015;
    }
}
