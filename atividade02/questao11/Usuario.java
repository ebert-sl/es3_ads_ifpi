package atividade02.questao11;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Conteudo> conteudos;

    public Usuario() {
        conteudos = new ArrayList<>();
    }

    public void criarPost(Conteudo conteudo) {
        conteudos.add(conteudo);
    }
}
