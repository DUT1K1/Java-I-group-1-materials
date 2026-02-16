import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // [1,2,3,4,5,6,7,8,9,10]
//        System.out.println("a".compareTo("b"));

//        ArrayList<Character> chars = new ArrayList<>(
//                List.of('b', 'a', 'z', 'd', 'r', 'k', 'l')
//        );
//        System.out.println(chars);
//        Collections.sort(chars);
//        System.out.println(chars);

//        Random rand = new Random();
//        List<Car> cars = new ArrayList<>();
//        String[] makers = {
//                "Toyota",
//                "Honda",
//                "Ford",
//                "Nissan",
//                "Chevy",
//                "Volkswagen",
//                "BMW",
//                "Mercedes",
//                "Audi",
//                "Hyundai"
//        };
//        for (int i = 0; i < 100; i++) {
//            Car car = new Car(
//                    makers[rand.nextInt(makers.length)],
//                    rand.nextInt(1000)
//            );
//            cars.add(car);
//        }
//        cars.forEach(System.out::println);
//        Collections.sort(cars);
//        System.out.println("====================================");
//        cars.forEach(System.out::println);








        Random rand = new Random();
        List<Car> cars = new ArrayList<>();
        String[] makers = {
                "Toyota",
                "Honda",
                "Ford",
                "Nissan",
                "Chevy",
                "Volkswagen",
                "BMW",
                "Mercedes",
                "Audi",
                "Hyundai"
        };
        for (int i = 0; i < 100; i++) {
            Car car = new Car(
                    makers[rand.nextInt(makers.length)],
                    rand.nextInt(1000)
            );
            cars.add(car);
        }
        cars.forEach(System.out::println);
//        Collections.sort(cars, new CarIdComparator());
//        Collections.sort(cars, new CarNameComparator());
        Collections.sort(cars, new CarComparator());
        System.out.println("======================================");
        cars.forEach(System.out::println);
    }
}
