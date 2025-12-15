package savarjisho3;

public abstract class Toy {
    private double additionalCosts;

    public Toy(double additionalCosts) {
        this.additionalCosts = additionalCosts;
    }

    public double getAdditionalCosts() {
        return additionalCosts;
    }

    public void setAdditionalCosts(double additionalCosts) {
        this.additionalCosts = additionalCosts;
    }

    public abstract double calculatePrice();
}
