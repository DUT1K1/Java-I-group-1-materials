import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise4 {
    public static void main(String[] args) {
        String text =
                """
                        Assure polite his real and other figures though. Day age advantages
                        and sufficient eating expression traveling. Of on am father by agreed
                        supply rather either . Own handsome delicate property mistresses her
                        end appetite. Mean are sons too sold nor said. Son share three men
                        power by you. Now merits wonder effect garret own.
                        """;

        String fileName = "src/files/first.txt";
        try (PrintWriter pw = new PrintWriter(fileName)) {
            pw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (
                BufferedReader br = new BufferedReader(
                        new FileReader(fileName)
                );
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter("src/files/second.txt")
                )
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toUpperCase());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
