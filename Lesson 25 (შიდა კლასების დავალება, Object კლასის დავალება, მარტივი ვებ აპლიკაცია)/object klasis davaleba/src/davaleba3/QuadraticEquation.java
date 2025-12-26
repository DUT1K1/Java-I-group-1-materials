package davaleba3;

import java.util.Objects;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        solve();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void solve(){
        double delta = Math.pow(b, 2) - 4 * a * c;
        this.x1 = (-b + Math.sqrt(delta)) / (2 * a);
        this.x2 = (-b - Math.sqrt(delta)) / (2 * a);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        QuadraticEquation equation = (QuadraticEquation) object;
        if (equation.getX1() == this.getX1() && equation.getX2() == this.getX2()) {
            return true;
        }
        if (equation.getX1() == this.getX2() && equation.getX2() == this.getX1()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC());
    }
}
