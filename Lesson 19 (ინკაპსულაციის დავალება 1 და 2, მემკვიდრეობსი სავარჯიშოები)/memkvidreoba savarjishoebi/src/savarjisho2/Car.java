package savarjisho2;

public class Car extends MotorVehicle{
    private int numDoors;

    public Car(String name, int numDoors) {
        super(name);
        this.numDoors = numDoors;
    }

    @Override
    public String describe() {
        return "Name: " + getName() + " " + "numDoors: " + numDoors;
    }

    @Override
    public String honkHorn() {
        return "Car: beep beep";
    }
}
