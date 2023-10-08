import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RepositoriosDePosts {
    private Post post;
    private String filePath;

    public RepositoriosDePosts( Post post, String filePath) {
        this.post = post;
        this.filePath = filePath;
    }

    public Post gePost() {
        return post;
    }

    public String getFilePath() {
        return filePath;
    }

    public void saveToFile() {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("ID: " + post.getId() + "\n");
            writer.write("Texto: " + post.getTexto() + "\n");
            writer.write("Autor: " + post.getAutor().getNome() + "\n");
            writer.write("Data: " + post.getData() + "\n");
            writer.write("Quantidade de Likes: " + post.getQuantidadeDeLikes() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linha;
        
        while( (linha=br.readLine()) != null) {
            System.out.println(linha);
           }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        }
    }
}
