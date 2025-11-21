public class Main {
    public static void main(String[] args) {
//        Person me = new Person();
//        me.name = "Davit";
//        me.skinColor = "white";
//        me.limbCount = 4;
//        me.age = 21;
//        me.isAlive = true;
//
//        System.out.println(me.name);
//        System.out.println(me.skinColor);
//        System.out.println(me.limbCount);
//        System.out.println(me.age);
//        System.out.println(me.isAlive);
//        me.walk();
//        me.eat();


//        Car car1 = new Car();
//        car1.make = "BMW";
//        car1.model = "M4 CS";
//        car1.year = 2025;
//        int months = car1.getYearMonths();
//        System.out.println(months);

//        Car car2 = new Car();
//        System.out.println(car2.make + " " + car2.model + " " + car2.year);

        Car car3 = new Car("BMW", "M4 CS", 2025);
        System.out.println(car3.make + " " + car3.model + " " + car3.year);
        Car car4 = new Car("Ford", "Mustang", 1969);
        System.out.println(car4.make + " " + car4.model + " " + car4.year);
    }
}
