package davaleba3;

public class Computer {
    private String country;
    private String company;
    private double price;
    private boolean hasWarranty;

    public Computer(String country, String company, double price, boolean hasWarranty) {
        this.country = country;
        this.company = company;
        this.price = price;
        this.hasWarranty = hasWarranty;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasWarranty() {
        return hasWarranty;
    }

    public void setHasWarranty(boolean hasWarranty) {
        this.hasWarranty = hasWarranty;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "country='" + country + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", hasWarranty=" + hasWarranty +
                '}';
    }


    public class Monitor {
        private double diagonal;
        private int resolution;
        private int refreshRate;
    }

    public class MotherBoard {
        private int ramSlots;
        private String ramType;
        private int frequency;
    }
}
