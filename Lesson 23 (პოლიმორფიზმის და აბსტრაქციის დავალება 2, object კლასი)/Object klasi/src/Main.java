import pack.subpack.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("1", "John", 20);
//        System.out.println(person.getClass());
//        System.out.println(Person.class);
        Person person2 = new Person("1", "John", 20);
        Person person3 = person2;
//        System.out.println(person.hashCode());
//        System.out.println(person2.hashCode());
//        Person person3 = person2;
//        System.out.println(person.equals(person2));
//        System.out.println(person2.equals(person3));


        // equals მეთოდის პრინციპები
        // რეფლექსიური: obj.equals(obj) == true
        // სიმეტრიული: x.equals(y) მაშინ y.equals(x)
        // ტრანზიტიული: x.equals(y) და y.equals(z) მაშინ x.equals(z)
        // მუდმივი
        // არანულოვანი: x.equals(null) == false

//        System.out.println(5 == 5);
//        System.out.println(person.equals(person2));
//        System.out.println(person == person2);
//        System.out.println(person2 == person3);

//        System.out.println("JUapb".equals("IuBpb"));
//        System.out.println("JUapb".hashCode());
//        System.out.println("IuBpb".hashCode());
    }
}
