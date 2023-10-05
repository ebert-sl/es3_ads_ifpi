package questao04;

public class VerificarValoresRendimentoDespesa implements Validacao {
    @Override
    public void validar(ImpostoDeRenda imposto) throws ValidacaoException {
        for (Double rendimento : imposto.getRendimentos()) {
            if (rendimento < 0) {
                throw new ValidacaoException("O valor de rendimento nao pode ser negativo.");
            }
        }
        for (Double despesa : imposto.getDespesas()) {
            if (despesa < 0) {
                throw new ValidacaoException("O valor de despesa nao pode ser negativo.");
            }
        }
    }
}
