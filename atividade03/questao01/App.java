package questao01;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        RepositorioDePosts repositorio = new RepositorioDePosts("questao01/output/posts.txt", true);
        Autor autor = new Autor(1, "Ebert", "xxxxx@gmail.com");
        Date data = new Date();
        Post post1 = new Post(1, "teste", autor, data);
        Post post2 = new Post(2, "teste2", autor, data);

        repositorio.saveToFile(post1);
        repositorio.saveToFile(post2);
    }
}
