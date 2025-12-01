package example2;

public class Baby extends Person {
    public Baby() {
        System.out.println("This is a baby constructor.");
    }

    public void cry() {
        System.out.println("Baby crying...");
    }

    public void eat() {
        System.out.println("Babies cant eat on their own.");
    }

    public void compareEatMethods() {
        eat();
        super.eat();
    }
}
