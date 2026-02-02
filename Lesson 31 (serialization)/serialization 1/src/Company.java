import java.io.Serializable;

public class Company implements Serializable {
    private static final long serialVersionUID = 2L;
    String name;
    int year;

    public Company(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
