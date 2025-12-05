package savarjisho2;

public class Airplane extends Vehicle{
    private float wingspan;
    private int capacity;

    public Airplane(String name, float wingspan, int capacity) {
        super(name);
        this.wingspan = wingspan;
        this.capacity = capacity;
    }

    private void landingGear(boolean set) {
        System.out.println( "Landing gear is " + (set ? "set" : "not set"));
    }

    @Override
    public float move(float distance) {
        return distance * 0.9f;
    }

    @Override
    public String describe() {
        return "Name: " + getName() + " " + "wingspan: " + wingspan + " " + "capacity: " + capacity;
    }
}
