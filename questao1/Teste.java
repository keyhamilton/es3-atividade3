import java.io.IOException;
import java.util.Date;

public class Teste {
    public static void main(String[] args) throws IOException {
        Autor autor = new Autor(0, "Pablo Neruda", "pablo.neruda@gmail.com");
        Post post = new Post(0, "sinto muita solidão", autor, new Date());

        RepositoriosDePosts posts = new RepositoriosDePosts(post, "posts.txt");

        posts.saveToFile();
        posts.readFromFile();
    }
}
