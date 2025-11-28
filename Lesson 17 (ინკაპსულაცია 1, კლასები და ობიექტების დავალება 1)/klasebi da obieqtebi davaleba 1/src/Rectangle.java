public class Rectangle {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double perimeter() {
        return 2 * (height + width);
    }

    double area() {
        return height * width;
    }

    double diagonal() {
        return Math.sqrt(height * height + width * width);
    }

    boolean isSquare() {
        return height == width;
    }
}
