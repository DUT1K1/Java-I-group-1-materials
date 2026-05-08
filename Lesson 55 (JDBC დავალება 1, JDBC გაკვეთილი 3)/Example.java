import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Example {
    private final String DELETE =
        "DELETE FROM students WHERE id = ?";

    public void delete(int id) {
        try (Connection con = dcm.getConnection()) {
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}