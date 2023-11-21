package questao05;

import java.util.ArrayList;
import java.util.List;

public class Postagem implements Publicavel {
    private String id;
    private Perfil autor;
    private String conteudo;
    private List<Reacao> reacoes;
    private List<Comentario> comentarios;

    public Postagem(String id, Perfil autor, String conteudo) {
        this.id = id;
        this.autor = autor;
        this.conteudo = conteudo;
        this.reacoes = new ArrayList<Reacao>();
        this.comentarios = new ArrayList<Comentario>();
    }

    public String getId() {
        return id;
    }

    public Perfil getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public List<Reacao> getReacoes() {
        return reacoes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void exibirComentarios() {
        for (Comentario comentario : comentarios) {
            comentario.exibir();
        }
    }

    public void exibirReacoes() {
        for (Reacao reacao : reacoes) {
            reacao.exibir();
        }
    }

    public void exibir() {
        System.out.println("Postagem [" + id + "] de " + autor.getNomeUsuario() +
        ": " + conteudo);
    }
}
