package savarjisho2;

public class Triangle extends Shape {
    private double z;

    public Triangle(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void shapeName() {
        System.out.println("Triangle");
    }

    @Override
    public void printInfo() {
        System.out.println("Shape {" +
                "x=" + getX() +
                " y=" + getY() +
                " z=" + z);
    }

    @Override
    public void printPerimeter() {
        System.out.println(
                getX() + getY() + z
        );
    }
}
