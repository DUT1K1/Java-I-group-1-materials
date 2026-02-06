import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        // Collection framework
        // 1, 2, 99, -100
        // null, 1,1,1,3,3,-10
//        ArrayList<Integer> list = new ArrayList<>(1000000);
//        System.out.println(list);
        // [ , , , , , , , , , ]
        // O(1) methods
//        System.out.println(list);
//        System.out.println("Is list empty? " + list.isEmpty());
//        list.add(1);
//        list.add(-10);
//        list.add(99);
//        System.out.println("List size: " + list.size());
//        System.out.println("Is list empty? " + list.isEmpty());
//        System.out.println(list.get(1));
//        System.out.println(list);
//        list.set(1, 499);
//        System.out.println(list);

        // O(n) methods
//        list.add(2, 15);
//        System.out.println(list);
        // [1,2,-19,3,4,5,6...,1_000_000]


        ArrayList<String> names = new ArrayList<>();
        names.add("Data");
        names.add("Nata");
        names.add("Tsotne");
        names.add("Ana");
        names.add("Tsotne");
        names.add("Dachi");
        System.out.println(names);
//        System.out.println(names.size());
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//        names.remove(0);
//        System.out.println(names);
//        names.remove("Giorgi");
//        System.out.println(names);

        names.remove("Tsotne");
        System.out.println(names);
    }
}
