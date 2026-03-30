public class Main {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
        // 1
//        System.out.println(list.size());
//        System.out.println(list.removeFirst());
//        System.out.println(list.get(0));

        // 2
//        list.add(10);
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        list.removeLast();
//        System.out.println(list.getLast());
//        System.out.println(list.getFirst());

        // 3
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.reverse();
        System.out.println(list);

        System.out.println(list.count(30));
        System.out.println(list.count(10));
        System.out.println(list.count(11));
    }
}
