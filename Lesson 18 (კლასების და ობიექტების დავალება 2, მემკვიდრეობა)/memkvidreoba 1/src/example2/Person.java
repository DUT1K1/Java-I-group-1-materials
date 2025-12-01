package example2;

public class Person {
    public String firstName;
    public String lastName;
    public String idNumber;
    public int age;

    public Person() {
        System.out.println("This is a person constructor.");
    }

    public void eat() {
        System.out.println(firstName + " " + lastName + " is eating.");
    }

    public void walk() {
        System.out.println(firstName + " " + lastName + " is walking.");
    }
}
