package savarjisho2;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double area() {
        double semiPerimeter = perimeter() / 2;

        double a = semiPerimeter - sideA;
        double b = semiPerimeter - sideB;
        double c = semiPerimeter - sideC;

        return Math.sqrt(a * b * c * semiPerimeter);
    }
}
