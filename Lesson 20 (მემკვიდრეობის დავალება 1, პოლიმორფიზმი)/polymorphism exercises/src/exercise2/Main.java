package exercise2;

public class Main {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        WashingMachine washingMachine = new WashingMachine();
        Appliance[] appliances = {refrigerator, washingMachine};

        for (Appliance appliance : appliances) {
            appliance.plugin();
            appliance.operate();
        }
    }
}
