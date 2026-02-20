import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(100, 200, 300);
//        System.out.println(list);
//        Stream<Integer> stream = list.stream();


//        String[] books = {"Book 1", "Book 2", "Book 3"};
//        Stream<String> stringStream = Arrays.stream(books);


//        Stream<String> stream1 = Stream.of("Book 1", "Book 2", "Book 3");
//        IntStream intStream = IntStream.range(1, 11);
//        intStream.forEach(System.out::println);

        // ======================================================================================
        // stream -> filter -> filter -> map -> ArrayList
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Stream<Integer> evenNumbers = list
//                .stream()
//                .filter(number -> number % 2 == 0);
//        evenNumbers.forEach(System.out::println);


        // .map()
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Stream<Integer> squaredNumbers = list
//                .stream()
//                .map(num -> num * num);
//        squaredNumbers.forEach(System.out::println);

        // .sorted()
//        List<Integer> list = Arrays.asList(100, 50, 150, 75);
//        list
//                .stream()
//                .peek(System.out::println)
//                .sorted()
//                .forEach(System.out::println);

        // .sorted() ჩვენი ტიპებისთვის
//        List<Human> people = Arrays.asList(
//                new Human("John", 25),
//                new Human("Mary", 30),
//                new Human("Peter", 22),
//                new Human("Anna", 27),
//                new Human("Paul", 19)
//        );
//        people
//                .stream()
//                .sorted()
//                .forEach(System.out::println);
//        System.out.println("===========================================");
//        people
//                .stream()
//                .sorted(new HumanNameComparator())
//                .forEach(System.out::println);
//        System.out.println("===========================================");
//        people
//                .stream()
//                .sorted((h1, h2) -> h1.getName().compareTo(h2.getName()))
//                .forEach(System.out::println);


        // .distinct()
//        List<String> colors = Arrays.asList("red", "blue", "green", "red", "yellow", "red");
//        colors
//                .stream()
//                .distinct()
//                .forEach(System.out::println);
//
//        List<Human> people = Arrays.asList(
//                new Human("John", 25),
//                new Human("Mary", 30),
//                new Human("John", 25),
//                new Human("Anna", 27),
//                new Human("John", 25)
//        );
//        people
//                .stream()
//                .distinct()
//                .forEach(System.out::println);


        // .limit()
//        List<String> tasks = Arrays.asList("Homework", "Cleaning", "Gaming", "Reading");
//        tasks
//                .stream()
//                .limit(2)
//                .forEach(System.out::println);


        // .skip()
//        List<String> tasks = Arrays.asList("Homework", "Cleaning", "Gaming", "Reading");
//        tasks
//                .stream()
//                .limit(1)
//                .skip(2)
//                .forEach(System.out::println);

        // =======================================================================================
        // Terminal ოპერაციები
        // .collect()
//        List<String> tasks = Arrays.asList("Homework", "Cleaning", "Gaming", "Reading");
//        List<String> processedTasks = tasks
//                .stream()
//                .skip(2)
//                .collect(Collectors.toList());
//        processedTasks.add("Sleeping");
//        System.out.println(processedTasks);

        // .forEach()
//        List<String> tasks = Arrays.asList("Homework", "Cleaning", "Gaming", "Reading");
//        List<String> otherTasks = new ArrayList<>();
//        tasks.stream().forEach(otherTasks::add);
//        System.out.println(otherTasks);

        // .reduce()
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int x = numbers
//                .stream()
//                .reduce(0, Integer::sum);
//        System.out.println(x);

        // .count()
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        long count = numbers
//                .stream()
//                .filter(num -> num % 2 == 0)
//                .count();
//        System.out.println(count);


        // ============================================================================
        // .allMatch()
//        List<String> names = Arrays.asList("Avrandili", "Mary", "Nikolozi");
//        boolean lenThree = names
//                .stream()
//                .allMatch(name -> name.length() > 4);
//        System.out.println(lenThree);


        // .anyMatch()
//        List<String> names = Arrays.asList("Avtandili", "Mary", "Nikolozi");
//        boolean lenThree = names
//                .stream()
//                .anyMatch(name -> name.length() >= 19);
//        System.out.println(lenThree);

        // .noneMatch()
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        boolean noneEven = numbers
//                .stream()
//                .noneMatch(n -> n < 0);
//        System.out.println(noneEven);


        // ===========================================================================
        // savarjisho 1
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> oddNumbers = numbers
//                .stream()
//                .filter(n -> n % 2 == 1)
//                .toList();
//        System.out.println(oddNumbers);

        // savarjisho 2
//        List<String> words = Arrays.asList("Java", "Spring", "Hibernate", "Lombok");
//        List<String> uppercaseWords = words
//                .stream()
//                .map(String::toUpperCase)
//                .toList();
//        System.out.println(uppercaseWords);

        // savarjisho 3
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int sum = numbers
//                .stream()
//                .filter(n -> n % 2 ==1)
//                .map(n -> n * n)
//                .reduce(0, Integer::sum);
//        System.out.println(sum);

        // savarjisho 4
//        List<String> words = Arrays.asList("Java", "hell", "go", "in", "the");
//        Map<Integer, Long> mappedWords = words
//                .stream()
//                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
//        System.out.println(mappedWords);

        // savarjisho 5
//        List<String> words = Arrays.asList("Java", "Streams", "Code", "Fun", "Fun");
//        LinkedHashSet<String> modifiedWords = words
//                .stream()
//                .sorted(Comparator.comparing(String::length))
//                .collect(Collectors.toCollection(LinkedHashSet::new));
//        System.out.println(modifiedWords);
    }
}
