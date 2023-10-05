package questao01;

import java.io.FileWriter;
import java.io.IOException;

public class RepositorioDePosts {
    private String filePath;
    private Boolean append;

    public RepositorioDePosts(String filePath, Boolean append) {
        this.filePath = filePath;
        this.append = append;
    }
    
    public void saveToFile(Post post) { 
        try (FileWriter writer = new FileWriter(filePath, append)) { 
            writer.write("ID: " + post.getId() + "\n"); 
            writer.write("Texto: " + post.getTexto() + "\n"); 
            writer.write("Autor: " + post.getAutor().getNome() + "\n"); 
            writer.write("Data: " + post.getData() + "\n"); 
            writer.write("Quantidade de Likes: " + post.getQuantidadeDeLikes() + "\n\n");
        } catch (IOException e) { 
            e.printStackTrace();
        }
    } 
}
