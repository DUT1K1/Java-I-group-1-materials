package exercise4;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public void getDetails() {
        System.out.println("Name: " + name);
    }
}
