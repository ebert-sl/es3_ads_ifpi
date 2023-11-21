package questao05;

public class Reacao implements Publicavel {
    private Postagem postagem;
    private String tipoReacao;

    public Reacao(Postagem postagem, String tipoReacao) {
        this.postagem = postagem;
        this.tipoReacao = tipoReacao;
    }

    public Perfil getAutor() {
        return postagem.getAutor();
    }

    public void exibir() {
        System.out.println("Reação [" + tipoReacao + "] de " +
        getAutor().getNomeUsuario() + " na postagem " + postagem.getId());
    }

    public void addReacao() {
        postagem.getReacoes().add(this);
    }
}
