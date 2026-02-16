import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // exercise 1
//        String sentence = "this is a test this is only a test to test this";
//        String[] words = sentence.split(" ");
//        HashMap<String, Integer> wordCount = new HashMap<>();
//        for (String word : words) {
//            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//        }
//        System.out.println(wordCount);


        // exercise 2
//        try (
//                BufferedReader br = new BufferedReader(
//                        new FileReader("src/vefxi.txt")
//                )
//        ) {
//            String line;
//            HashMap<String, Integer> wordCount = new HashMap<>();
//            while ((line = br.readLine()) != null) {
//                String[] words = line.split("\\s+");
//                for (String word : words) {
//                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//                }
//            }
//            System.out.println(wordCount);
//        } catch (IOException e) {
//            System.out.println("Error opening file");
//        }


        // exercise 3
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student(3, "Alice"));
//        students.add(new Student(4, "Bob"));
//        students.add(new Student(1, "Carl"));
//        Collections.sort(students);
//        students.forEach(System.out::println);

        // exercise 4
//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Alice", 50000));
//        employees.add(new Employee("Bob", 150000));
//        employees.add(new Employee("Charlie", 24000));
//        employees.add(new Employee("David", 20000));
//        Collections.sort(employees, new EmployeeSalaryComparator());
//        employees.forEach(System.out::println);


        // exercise 5
//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new Employee("Alice", 50000));
//        employees.add(new Employee("Bob", 150000));
//        employees.add(new Employee("Charlie", 24000));
//        employees.add(new Employee("David", 20000));
//        Comparator<Employee> employeeComparator = new Comparator<>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        };
//        Collections.sort(employees, employeeComparator);
//        employees.forEach(System.out::println);


        // exercise 6
//        ArrayList<Integer> nums = new ArrayList<>(
//                List.of(5,1,1,1,2,3,3,4,1,1,2,3,4,1,1,2,3,1,1,2,2,3)
//        );
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i : nums) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
//        System.out.println(map);
//        HashSet<Integer> set = new HashSet<>(nums);
//        System.out.println(set);
//        Set<Integer> set = map.keySet();
//        System.out.println(set);


        // exercise 7
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 20000.00));
        employees.add(new Employee("Alice", 20000));
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 150000));
        employees.add(new Employee("Alice", 24000));

        employees.forEach(System.out::println);
        Comparator<Employee> empComparator = Comparator
                .comparing((Employee e) -> e.name)
                .thenComparing((Employee e) -> e.salary);
        employees.sort(empComparator);
        System.out.println("=============================");
        employees.forEach(System.out::println);
    }
}
