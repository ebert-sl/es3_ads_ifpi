package questao04;

public class VerificarQuantidadeRendimento implements Validacao {
    @Override
    public void validar(ImpostoDeRenda imposto) throws ValidacaoException {
        if (imposto.getRendimentos().size() > 5) {
            throw new ValidacaoException("A quantidade de rendimentos ultrapassou o limite de 5.");
        }
    }
}
