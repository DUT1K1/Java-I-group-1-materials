package savarjisho3;

public class Doll extends Toy{
    private double hairPrice;
    private double clothesPrice;

    public Doll(double hairPrice, double clothesPrice, double additionalCosts) {
        super(additionalCosts);
        this.hairPrice = hairPrice;
        this.clothesPrice = clothesPrice;
    }

    public double getHairPrice() {
        return hairPrice;
    }

    public void setHairPrice(double hairPrice) {
        this.hairPrice = hairPrice;
    }

    public double getClothesPrice() {
        return clothesPrice;
    }

    public void setClothesPrice(double clothesPrice) {
        this.clothesPrice = clothesPrice;
    }

    @Override
    public double calculatePrice() {
        return hairPrice + clothesPrice + getAdditionalCosts();
    }
}
