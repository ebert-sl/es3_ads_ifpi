package q05;

public class Retirada implements Operacao {
    @Override
    public double calcularTaxas(Transacao transacao) {
        return transacao.getValor() * 0.02;
    }
}
