import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    // 1) b
    // 2) a
    // 3) a, b, d
    // 4) c
    // 5) a, c
    // 6) b
    // 7) c
    // 8) b
    // 9) b
    // 10) c
    // 11) c
    // 12) b
    // 13) a, b, c, d
    // 14) b, d
    // 15) b, c
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        ArrayList<Student> students = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(
                new FileReader(inputFile)
        )) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String firstName = parts[1];
                String lastName = parts[2];
                int year = Integer.parseInt(parts[3]);
                double gpa = Double.parseDouble(parts[4]);
                String[] subjectArr = parts[5].split("\\s+");
                List<String> subjects = new ArrayList<>(
                        Arrays.asList(subjectArr)
                );

                Student student = new Student(
                        id,
                        firstName,
                        lastName,
                        year,
                        gpa,
                        subjects
                );

                students.add(student);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(outputFile)
        )) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println(e);
        }

        List<Student> deserializedStudents = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(outputFile)
        )) {
            deserializedStudents = (List<Student>) ois.readObject();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
//        deserializedStudents.forEach(System.out::println);


//        System.out.println(List.of(1,2,3).equals(List.of(3,1,2)));

//        System.out.println(deserializedStudents.get(0));

//        deserializedStudents.sort(
//                Comparator.comparing(Student::getGpa)
//        );
        Collections.sort(deserializedStudents);
        deserializedStudents.forEach(s -> System.out.println(s.getGpa()));
    }
}
