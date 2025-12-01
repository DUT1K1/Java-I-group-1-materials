public class Car {
    String make;
    String model;
    int year;
    String licensePlate;

    public Car(String make, String model, int year, String licensePlate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
    }

    void printInfo() {
        System.out.println(
                "{\n" +
                        "\t\"Make\": \"" + make + "\",\n" +
                        "\t\"Model\": \"" + model + "\",\n" +
                        "\t\"Year\": \"" + year + "\",\n" +
                        "\t\"License plate\": \"" + licensePlate + "\"" +
                "\n}"
        );
    }
}
