import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise5 {
    public static void main(String[] args) {
        String firstFile = "src/files/first.txt";
        String secondFile = "src/files/second.txt";

        try (
                BufferedReader firstReader = new BufferedReader(
                        new FileReader(firstFile)
                );
                BufferedReader secondReader = new BufferedReader(
                        new FileReader(secondFile)
                );
                PrintWriter pw = new PrintWriter(
                        "src/files/merged.txt"
                ))
        {
            pw.println("პირვერლი ფაილი");
            String line;
            while ((line = firstReader.readLine()) != null) {
                pw.println(line);
            }

            pw.println();

            pw.println("მეორე ფაილი");
            while ((line = secondReader.readLine()) != null) {
                pw.println(line);
            }

        } catch (IOException e) {

        }
    }
}
