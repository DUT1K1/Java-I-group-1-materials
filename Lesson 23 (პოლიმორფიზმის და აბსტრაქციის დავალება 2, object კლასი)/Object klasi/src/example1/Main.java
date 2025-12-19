package example1;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.getClass());
        a = new C();
        System.out.println(a.getClass());
    }
}
