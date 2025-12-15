package savarjisho2;

public class Shape {
    private double x;
    private double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void shapeName() {
        System.out.println("Generic Shape");
    }

    public void printInfo() {
        System.out.println("Shape {x=" + x + ", y=" + y + "}");
    }

    public void printPerimeter() {
        System.out.println("Generic Perimeter");
    }
}
