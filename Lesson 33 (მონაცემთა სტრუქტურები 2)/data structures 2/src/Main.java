import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        System.out.println(list.isEmpty());
//        list.add("Davit");
//        list.add("Tsotne");
//        list.add("Ana");
//        list.add("Nata");
//        list.add("Tsotne");
//        list.add("Nini");
//        System.out.println(list);
//        System.out.println(list.get(2));
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        System.out.println(list.size());
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        System.out.println(list);
//        System.out.println(list.remove(0));
//        System.out.println(list);
//        System.out.println(list.remove("Tsotne"));
//        System.out.println(list);
//        System.out.println(list.remove("Tsotne"));
//        System.out.println(list);
//        System.out.println(list.remove("Tsotne"));
//        System.out.println(list);

//        System.out.println(list.contains("Nini"));
//        System.out.println(list.contains("Ana"));
//        System.out.println(list.contains("Tsotne"));
//        System.out.println(list.contains("Giorgi"));

//        System.out.println(list.indexOf("Nata"));
//        System.out.println(list.indexOf("Giorgi"));
//        System.out.println(list.isEmpty());
//        list.clear();
//        System.out.println(list.isEmpty());


//        List<String> list = new ArrayList<>();
//        list.add("1. Davit");
//        list.add("2. Tsotne");
//        list.add("3. Ana");
//        list.add("4.Nata");
//        list.add("5. Tsotne");
//        list.add("6. Nini");

//        for (String s : list){
//            list.remove(s);
//        }

//        for (int i = 0; i < list.size(); i++) {
//            list.remove(i);
//        }
//        System.out.println(list.size());

//        for (int i = list.size() - 1; i >= 0; i--) {
//            System.out.println(list.remove(i));
//        }


//        Vector<Integer> vector = new Vector<>();


//        List<String> linkedList = new LinkedList<>();
//        linkedList.add("asdf");
//        linkedList.size();
//        linkedList.remove(1);
//        Node n1 = new Node(1);
//        Node n2 = new Node(2);
//        n1.next = n2;
//
//
//        Node n3 = new Node(3);
//        n3.next = n2;
//        n1.next = n3;
//
//        Node temp = n1;
//        while (temp != null) {
//            System.out.println(temp.value);
//            temp = temp.next;
//        }


        // e1, e2 არასდროს e1.equals(e2)
//        Set<String> set = new HashSet<>();
//        set.add("Davit");
//        set.add("Davit");
//        set.add("Davit");
//        set.add("Tsotne");
//        set.add("Ana");
//        System.out.println(set);
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());
//        set.clear();
//        System.out.println(set);
//        System.out.println(set.contains("Davit"));
//        System.out.println(set.remove("Davit"));
//        System.out.println(set.remove("Davit"));


//        List<String> list = new ArrayList<>();
//        list.add("Davit");
//        list.add("Davit");
//        list.add("Davit");
//        list.add("Tsotne");
//        list.add("Tsotne");
//        list.add("Tsotne");
//        list.add("Ana");
//        list.add("Ana");
//        list.add("Ana");
//        list.add("Ana");
//        list.add("Ana");
//
//        System.out.println(list);
//        Set<String> set = new HashSet<>();
//        for (String s : list) {
//            set.add(s);
//        }
//        System.out.println(set);


//        String s1 = new String("abc");
//        String s2 = new String("abc");
//        Set<String> set = new HashSet<>();
//        set.add(s1);
//        set.add(s2);
//        System.out.println(set);


//        Animal a1 = new Animal("tiger", 12);
//        Animal a2 = new Animal("lion", 3);
//        Animal a3 = new Animal("cat", 4);
//        Animal a4 = new Animal("tiger", 12);
//        Set<Animal> animalSet = new HashSet<>();
//        animalSet.add(a1);
//        animalSet.add(a2);
//        animalSet.add(a3);
//        animalSet.add(a4);
//
//        System.out.println(animalSet);


//        Map<String, Integer> fruits = new HashMap<>();
//        fruits.put("apple", 12);
//        fruits.put("orange", 13);
//        fruits.put("kiwi", 14);
//        fruits.put("grape", 15);
//        fruits.put("apple", 12);
//        System.out.println(fruits);
//        System.out.println(fruits.get("apple"));
//        System.out.println(fruits.keySet());
//        System.out.println(fruits.values());

//        Map<Animal, String> gender = new HashMap<>();
//        gender.put(
//                new Animal("tiger", 12),
//                "male"
//        );
//        gender.put(
//                new Animal("tiger", 12),
//                "female"
//        );
//        System.out.println(gender);


//        HashMap<String, String> map = new HashMap<>();
//        map.put("0159", "didi dighomi");
//        map.put("0163", "varketili");
//        map.put("0137", "samgori");
//        map.put("0108", "rustaveli");
//        System.out.println(map);
//        map.clear();
//        System.out.println(map);
//        System.out.println(map.containsKey("0123"));
//        System.out.println(map.containsValue("didi dighomi"));

//        for (String key : map.keySet()) {
//            System.out.println(map.get(key));
//        }

//        System.out.println(map);
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println(entry + " key=" + entry.getKey() + " value=" + entry.getValue());
//        }

//        System.out.println(map);
//        map.putIfAbsent("0108", "vake");
//        System.out.println(map);

        int[] nums = {1,2,3,4,1,1,1,2,3,2,1,4,1,2,3,1,1,2,3,4,1,2,3};
        Map<Integer, Integer> map = new HashMap<>();

//        for (int x : nums) {
//            if (map.containsKey(x)) {
//                map.put(x, map.get(x) + 1);
//            } else {
//                map.put(x, 1);
//            }
//        }
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map);
    }
}
