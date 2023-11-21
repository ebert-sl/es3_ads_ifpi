package questao05;

public class Comentario implements Publicavel {
    private Postagem postagemNova;
    private Postagem postagemOriginal;

    public Comentario(Postagem postagemNova, Postagem postagemOriginal) {
        this.postagemNova = postagemNova;
        this.postagemOriginal = postagemOriginal;
    }

    public Perfil getAutor() {
        return postagemNova.getAutor();
    }

    public void exibir() {
        System.out.println("Comentário de " + getAutor().getNomeUsuario() + 
        " em resposta a postagem [" + postagemOriginal.getId() + "]: " + postagemNova.getConteudo());
    }

    public void addComentario() {
        postagemOriginal.getComentarios().add(this);
    }
}
