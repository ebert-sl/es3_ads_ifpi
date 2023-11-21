package questao05;

public class App {
    public static void main(String[] args) {
        Perfil perfil1 = new Perfil(1, "Ian");
        Perfil perfil2 = new Perfil(2, "Saraiva");

        Postagem postagem1 = new Postagem("1", perfil1, "Teste");
        postagem1.exibir();
        Reacao reacao = new Reacao(postagem1, "Curti");
        reacao.addReacao();
        Reacao reacao2 = new Reacao(postagem1, "Amei");
        reacao2.addReacao();

        Postagem postagem2 = new Postagem("2", perfil2, "Feito com sucesso!");
        postagem2.exibir();
        Comentario comentario = new Comentario(postagem2, postagem1);
        comentario.addComentario();

        postagem1.exibirReacoes();
        postagem1.exibirComentarios();
    }
}
