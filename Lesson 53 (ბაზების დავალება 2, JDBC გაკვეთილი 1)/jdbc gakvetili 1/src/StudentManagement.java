import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManagement {
    private final DatabaseConnectionManager dcm =
            new DatabaseConnectionManager(
                    "jdbc:postgresql://localhost:5433/test",
                    "postgres",
                    "admin"
            );

    public void printAllStudents() {
        try (
                Connection connection = dcm.getConnection()
        ) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM students;");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + "\t" +
                                rs.getString("first_name") + "\t" +
                                rs.getString("last_name")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void deleteAllStudents() {
        try (
                Connection connection = dcm.getConnection()
        ) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM students;");
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void updateStudentName(int id, String newName) {
        try (
                Connection connection = dcm.getConnection()
        ) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("UPDATE students SET first_name = '" + newName + "' WHERE id = " + id + ";");
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
