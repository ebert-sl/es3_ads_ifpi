package questao04;

public class VerificarCPFNuloVazio implements Validacao {
    @Override
    public void validar(ImpostoDeRenda imposto) throws ValidacaoException {
        if (imposto.getCPF() == null || imposto.getCPF() == "") {
            throw new ValidacaoException("CPF nao pode ser nulo ou vazio.");
        }
    }
}
