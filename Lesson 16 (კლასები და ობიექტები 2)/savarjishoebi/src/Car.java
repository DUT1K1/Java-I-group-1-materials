public class Car {
    String brand;
    int speed;

    void display() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed);
    }

    void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }
}
