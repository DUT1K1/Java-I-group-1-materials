package exercise4;

public class HalfTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public HalfTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
