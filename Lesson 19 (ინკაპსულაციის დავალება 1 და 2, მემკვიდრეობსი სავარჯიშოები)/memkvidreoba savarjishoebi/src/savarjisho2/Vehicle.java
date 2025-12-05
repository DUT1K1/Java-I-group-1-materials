package savarjisho2;

public class Vehicle {
    private String name;
    protected int speed;

    protected Vehicle(String name) {
        this.name = name;
    }

    public float move(float distance) {
        return distance;
    }

    public String getName() {
        return name;
    }

    public String describe() {
        return "Vehicle: " + name;
    }
}
