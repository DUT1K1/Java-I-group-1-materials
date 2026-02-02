import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    String firstName;
    transient String lastName;
    int age;
    Company company;

    public User(String firstName, String lastName, int age, Company company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.company = company;
    }

    public void sayHello() {
        System.out.println("Hello, " + firstName + " " + lastName);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", company=" + company +
                '}';
    }
}
