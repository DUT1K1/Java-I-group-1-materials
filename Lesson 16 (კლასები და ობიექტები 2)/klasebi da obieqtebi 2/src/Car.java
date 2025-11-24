public class Car {
    String make;
    String model;
    int year;

    Car() {

    }

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.print("Make: " + this.make);
        System.out.print("\tModel: " + this.model);
        System.out.println("\tYear: " + this.year);
    }
}
