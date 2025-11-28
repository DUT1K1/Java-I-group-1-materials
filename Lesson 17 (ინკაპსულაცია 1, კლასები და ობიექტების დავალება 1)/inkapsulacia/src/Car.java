public class Car {
    public static int numberOfWheels = 4;
    public String color;
    public int speed;

    public static void printGeneralInfo() {
        System.out.println("Number of wheels: " + numberOfWheels);
    }

    public void printCarInfo() {
        System.out.println("Color: " + color + " speed: " + speed);
    }

}
