package q02;

public class RedeSocial {
    public void postarMensagem(String mensagem) throws ValidacaoError {
        if (mensagem == null || mensagem.trim().equals("")) {
            // espera e tenta novamente
            throw new ValidacaoError("A mensagem não pode ser vazia...");
        }
        System.out.println("Mensagem postada: " + mensagem);
    }
}

