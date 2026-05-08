import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImplementation implements StudentDao {
    private final DCM dcm;
    private final String INSERT_STUDENT =
            "INSERT INTO students (first_name, last_name) VALUES (?, ?) RETURNING id";
     private final String FIND_ALL =
             "SELECT * FROM students";
    private final String FIND_BY_ID =
            "SELECT * FROM students WHERE id = ?";
    private final String UPDATE =
            "UPDATE students SET first_name = ?, last_name = ? WHERE id = ?";
    private final String DELETE =
            "DELETE FROM students WHERE id = ?";

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
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet rs = ps.executeQuery();

            List<Student> students = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");

                students.add(new Student(id, firstName, lastName));
            }

            return students;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    @Override
    public Student findById(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_BY_ID);

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Student(
                        rs.getInt("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Student update(Student student) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(UPDATE);

            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setInt(3, student.getId());

            ps.executeUpdate();

            return findById(student.getId());
        }  catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(int id) {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(DELETE);

            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
