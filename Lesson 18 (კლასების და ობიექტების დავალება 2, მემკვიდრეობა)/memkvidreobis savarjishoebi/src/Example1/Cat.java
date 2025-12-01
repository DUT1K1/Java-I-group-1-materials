package Example1;

public class Cat extends Animal {
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Meow meow!");
    }
}
