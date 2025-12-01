package example3;

public class Car extends Vehicle{
    private String make;
    private String model;

    public Car(String color, int maxSpeed, String make, String model) {
        super(color, maxSpeed);
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
