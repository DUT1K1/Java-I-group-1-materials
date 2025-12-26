package davaleba2;

import java.util.Objects;

public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object object) {
        // 1/2 != 2/4
        if (object == null || getClass() != object.getClass()) return false;
        Fraction fraction = (Fraction) object;
        return this.getNumerator()/this.getDenominator() == fraction.getNumerator()/fraction.getDenominator();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumerator() / getDenominator());
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
