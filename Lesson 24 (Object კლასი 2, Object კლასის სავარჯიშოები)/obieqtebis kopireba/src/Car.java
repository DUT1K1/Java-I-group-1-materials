public class Car {
    String brand;
    Engine engine;

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public Car(Car original) {
        this.brand = original.brand;
        this.engine = new Engine(original.engine.cylinders);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }
}
