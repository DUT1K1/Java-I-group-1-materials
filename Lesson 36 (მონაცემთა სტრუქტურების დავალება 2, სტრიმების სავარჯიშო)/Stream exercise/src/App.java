import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        List<Employee> employees = employeeFactory.getAllEmployees();

        // Fist name and last name of employees who start with A
//        employees
//                .stream()
//                .filter(employee -> employee.getFirstName().startsWith("A"))
//                .forEach(x -> System.out.println(x.getFirstName() + " " + x.getLastName()));

        // თანამშრომლები რომლებიც 2023 წელს შემოუერთდნენ
//        employees
//                .stream()
//                .filter(employee -> employee.getId().startsWith("2023"))
//                .forEach(x -> System.out.println(x.getFirstName() + " " + x.getLastName()));

        // დავსორტოთ თანამშრომლები ჯერ სახელის შემდეგ ხელფასის მიხედვით
        employees
                .stream()
                .sorted(
                        Comparator
                                .comparing(Employee::getFirstName)
                                .thenComparing(Employee::getSalary)
                )
                .forEach(e -> System.out.println(e.getFirstName() + "\t\t" + e.getSalary()));
    }
}
