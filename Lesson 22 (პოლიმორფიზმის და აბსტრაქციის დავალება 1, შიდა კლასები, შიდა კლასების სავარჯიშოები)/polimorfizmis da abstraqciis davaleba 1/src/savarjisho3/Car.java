package savarjisho3;

public class Car extends Toy{
    private double interiorPrice;
    private double tyrePrice;

    public Car(double interiorPrice, double tyrePrice, double additionalCosts) {
        super(additionalCosts);
        this.interiorPrice = interiorPrice;
        this.tyrePrice = tyrePrice;
    }

    public double getInteriorPrice() {
        return interiorPrice;
    }

    public void setInteriorPrice(double interiorPrice) {
        this.interiorPrice = interiorPrice;
    }

    public double getTyrePrice() {
        return tyrePrice;
    }

    public void setTyrePrice(double tyrePrice) {
        this.tyrePrice = tyrePrice;
    }

    @Override
    public double calculatePrice() {
        return interiorPrice + 4 * tyrePrice + getAdditionalCosts();
    }
}
