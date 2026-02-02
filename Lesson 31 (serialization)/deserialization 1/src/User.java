import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    String firstName;
    transient String lastName;
    Company company;

    public User(String firstName, String lastName, Company company) {
        this.firstName = firstName;
        this.lastName = lastName;
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
                ", company=" + company +
                '}';
    }
}
