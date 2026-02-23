import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//       String[] words = {
//               "apple", "banana", "apple",
//               "apple", "orange"
//       };
//
//        HashMap<String, Integer> map = new HashMap<>();
//        for (String word : words) {
//            map.put(word, map.getOrDefault(word, 0) + 1);
//        }
//        System.out.println(map);

        Student student = new Student("123", "John", "Doe");
        Student student1 = new Student("456", "Jane", "Doe");
        Student student2 = new Student("789", "John", "Smith");
        student.addScore("Math", 9);
        student1.addScore("Georgian", 3);
        student2.addScore("Physics", 7);
        List<Student> students = new ArrayList<>(List.of(student, student1, student2));
        students.forEach(System.out::println);
        System.out.println("==========================================================");
        Collections.sort(students);
        students.forEach(System.out::println);
        System.out.println("==========================================================");
        Collections.sort(students, new StudentLastNameComparator());
        students.forEach(System.out::println);
    }
}
