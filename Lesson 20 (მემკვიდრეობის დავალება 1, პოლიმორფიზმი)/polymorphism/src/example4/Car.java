package example4;

public class Car implements Movements, AddOnActions{
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car is turning left");
    }

    @Override
    public void turnRight() {
        System.out.println("Car is turning right");
    }

    @Override
    public void honk() {
        System.out.println("Car is honking");
    }

    @Override
    public void windshieldWipers() {
        System.out.println("Car is wiping windshield");
    }

    @Override
    public void airConditioning() {
        System.out.println("Car is turning on air conditioning");
    }
}
