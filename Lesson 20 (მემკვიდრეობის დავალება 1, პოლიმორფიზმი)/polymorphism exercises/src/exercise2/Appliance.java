package exercise2;

public abstract class Appliance {
    public void plugin() {
        System.out.println("Appliance is plugged in.");
    }

    abstract void operate();
}
