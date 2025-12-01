package example2;

public class Student extends Person {
    void display(){
        System.out.println("Name: " + name);
//        System.out.println("Age: " + age); // ამას ვერ ვიზამ რადგან არის private
        System.out.println("Age: " + getAge());
    }
}
