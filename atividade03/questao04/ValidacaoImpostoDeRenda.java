package questao04;

import java.util.List;

public class ValidacaoImpostoDeRenda {
    public List<Validacao> validacoes;

    public ValidacaoImpostoDeRenda(List<Validacao> validacoes) {
        this.validacoes = validacoes;
    }
    
    public void validarImposto(ImpostoDeRenda imposto) throws ValidacaoException {
        for (Validacao validacao : validacoes) {
            validacao.validar(imposto);
        }
    }
}
