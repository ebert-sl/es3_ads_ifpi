package questao04;

public class VerificarCPFCaracteres implements Validacao {
    @Override
    public void validar(ImpostoDeRenda imposto) throws ValidacaoException {
        if (imposto.getCPF().length() != 11) {
            throw new ValidacaoException("CPF deve conter 11 caracteres.");
        }
    }
}
