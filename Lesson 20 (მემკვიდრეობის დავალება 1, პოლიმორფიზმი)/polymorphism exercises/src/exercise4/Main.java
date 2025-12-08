package exercise4;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("John", 1000),
                new HalfTimeEmployee("Mary", 20, 20)
        };

        for (Employee employee : employees) {
            employee.getDetails();
            System.out.println("Salary: " + employee.calculateSalary());
        }
    }
}
