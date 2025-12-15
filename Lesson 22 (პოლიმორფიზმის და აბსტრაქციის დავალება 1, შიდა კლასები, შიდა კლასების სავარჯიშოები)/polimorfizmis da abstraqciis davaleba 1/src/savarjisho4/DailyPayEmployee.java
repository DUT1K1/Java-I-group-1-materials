package savarjisho4;

public class DailyPayEmployee extends Employee{
    private double salary;
    private int daysOfWork;

    public DailyPayEmployee(String firstName, String lastName, String phoneNumber, double salary, int daysOfWork) {
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
        this.daysOfWork = daysOfWork;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDaysOfWork() {
        return daysOfWork;
    }

    public void setDaysOfWork(int daysOfWork) {
        this.daysOfWork = daysOfWork;
    }

    @Override
    public double calculateSalary() {
        return salary * daysOfWork;
    }
}
