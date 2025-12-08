package exercise5;

public class Example implements A, B{
    @Override
    public void foo() {
        System.out.println("foo");
        bar();
    }
}
