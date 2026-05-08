import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImplementation implements StudentDao {
    private final DCM dcm;
    private final String INSERT_STUDENT =
            "INSERT INTO students (first_name, last_name) VALUES (?, ?) RETURNING id";

    public StudentDaoImplementation() {
        this.dcm = new DCM(
                "jdbc:postgresql://localhost:5433/test",
                "postgres",
                "admin"
        );
    }

    @Override
    public Student create(Student student) {
        // სახელი სწორი ფორმატითაა??
        // გვარი სწორია?
        // ნამდვილად ლათინური ასოებით წერია?
        // id ხომ არ შეიყვანეს?

        // არცერთ ზემოთ მოცემულ ლოგიკას აქ არ ვწერთ
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps =
                    con.prepareStatement(INSERT_STUDENT);

            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());

            ResultSet rs = ps.executeQuery();
            Student createdStudent = null;
            if (rs.next()) {
                createdStudent = new Student(
                        rs.getInt("id"),
                        student.getFirstName(),
                        student.getLastName()
                );
            }

            return createdStudent;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
