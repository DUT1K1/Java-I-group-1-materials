import example2.Baby;
import example2.Person;
import example3.Car;
import example3.Vehicle;

public class Main {
    public static void main(String[] args) {
//        Baby baby = new Baby();
//        baby.age = 1;
//        baby.firstName = "John";
//        baby.lastName = "Doe";
//        baby.eat();
//        baby.walk();
//        baby.cry();
//        Person person = new Person();
//        person.cry(); // ეს არ შეიძლება
//        baby.compareEatMethods();


//        Baby baby = new Baby();

//        Car car = new Car("Red", 350, "Ferrari", "F40");
//        System.out.println(car.getColor());
//        System.out.println(car.getMaxSpeed());
//        System.out.println(car.getMake());
//        System.out.println(car.getModel());
//
//        Vehicle vehicle = new Vehicle("Blue", 200);
//        System.out.println(vehicle.getColor());
//        System.out.println(vehicle.getMaxSpeed());
//        System.out.println(vehicle.getMake());


        Vehicle vehicle = new Car(
                "Red",
                350,
                "Ferrari",
                "F40"
        );
        Vehicle otherVehicle = new Vehicle("Blue", 200);
        System.out.println("Type of otherVehicle: " + otherVehicle.getClass().getName());
        System.out.println("Type of vehicle: " + vehicle.getClass().getName());
        System.out.println(vehicle.getColor());
        System.out.println(vehicle.getMaxSpeed());
        System.out.println("_________________________________________________________________________");

        Car castToCar = (Car) vehicle;
        System.out.println(castToCar.getColor());
        System.out.println(castToCar.getMaxSpeed());
        System.out.println(castToCar.getMake());
        System.out.println(castToCar.getModel());


        System.out.println("_________________________________________________________________________");
        Car straightCastToCar = (Car) new Vehicle("Blue", 200);
        System.out.println(straightCastToCar.getColor());
        System.out.println(straightCastToCar.getMaxSpeed());
        System.out.println(straightCastToCar.getMake());
        System.out.println(straightCastToCar.getModel());
    }
}
