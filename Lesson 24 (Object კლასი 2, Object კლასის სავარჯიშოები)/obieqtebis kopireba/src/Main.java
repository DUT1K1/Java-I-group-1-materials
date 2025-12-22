public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        // ეს არაა კოპირება
//        Person p1 = new Person("John");
//        Person p2 = p1;
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p1 == p2);
//        p1.name = "Mike";
//        System.out.println(p2);


        // კლონირება
//        Student s1 = new Student(1, "John");
//        Student s2 = s1.clone();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1 == s2);
//        s1.name = "Mike";
//        System.out.println(s2);
//        System.out.println(s1);


        // როდისაა კლონირება არასაკმარისი?
//        Address a1 = new Address("Kutaisi");
//        Student s1 = new Student(1, "Davit", a1);
//        Student s2 = s1.clone();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1 == s2);
//        System.out.println(s1.address == s2.address);
//        s1.address.city = "Tallinn";
//        System.out.println(s2);
//        System.out.println(s1);


        // კლონირება მხოლოდ კონსტრუქტორებით
        Engine e1 = new Engine(6);
        Car c1 = new Car("Nissan", e1);
        Car c2 = new Car(c1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 == c2);
        System.out.println(c1.engine == c2.engine);
    }
}
