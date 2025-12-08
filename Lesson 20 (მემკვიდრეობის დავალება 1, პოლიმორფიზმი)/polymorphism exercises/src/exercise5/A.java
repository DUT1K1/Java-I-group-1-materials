package exercise5;

public interface A {
    void foo();

    default void bar() {
        System.out.println("in interface A");
    }
}
