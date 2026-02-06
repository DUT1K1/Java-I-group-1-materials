import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise3 {
    public static void main(String[] args) {
        String path = "vafxi.txt";
        String searchWord = "ხმალი";

        try {
            String content = new String(
                    Files.readAllBytes(
                            Paths.get(path)
                    )
            );

            if (content.contains(searchWord)) {
                System.out.println("Found search word in file.");
            } else {
                System.out.println("Search word not found in file.");
            }
        } catch (IOException e) {

        }
    }
}
