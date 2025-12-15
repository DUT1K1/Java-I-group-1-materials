package savarjisho2;

public class Rectangle extends Shape {
    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void shapeName() {
        System.out.println("Rectangle");
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void printPerimeter() {
        System.out.println(2 * (getX() + getY()));
    }
}
