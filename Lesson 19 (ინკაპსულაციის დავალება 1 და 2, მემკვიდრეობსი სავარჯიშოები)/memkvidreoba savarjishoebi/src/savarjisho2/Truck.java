package savarjisho2;

public class Truck extends MotorVehicle{
    private float horsePower;

    public Truck(String name, float horsePower) {
        super(name);
        this.horsePower = horsePower;
    }

    @Override
    public String describe() {
        return "Name: " + getName() + " " + "horsePower: " + horsePower;
    }

    @Override
    public String honkHorn() {
        return "Truck: beep beep";
    }
}
