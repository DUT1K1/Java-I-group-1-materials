import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise2 {
    public static void main(String[] args) {
        String filePath = "vafxi.txt";
        try {
            String content = new String(
                    Files.readAllBytes(
                            Paths.get(filePath)
                    )
            );
            System.out.println(content);
            String[] words = content.split("\\s+|-");
            System.out.println("Number of words: " + words.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
