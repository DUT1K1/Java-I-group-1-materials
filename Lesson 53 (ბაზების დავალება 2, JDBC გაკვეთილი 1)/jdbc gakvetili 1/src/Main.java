import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.sql.Statement;

public class Main {
    // CRUD
    // Create
    // Read
    // Update
    // Delete
    public static void main(String[] args) throws SQLException {
//        Connection connection = DriverManager.getConnection(
//                "jdbc:postgresql://localhost:5433/test",
//                "postgres",
//                "admin"
//        );
//
//        Statement statement = connection.createStatement();
//        ResultSet rs = statement.executeQuery("SELECT * FROM students;");
//
//        while (rs.next()) {
//            System.out.println(
//                    rs.getInt("id") + "\t" +
//                    rs.getString("first_name") + "\t" +
//                    rs.getString("last_name")
//            );
//        }

//        System.out.println(connection.isClosed());






//        DatabaseConnectionManager dcm = new DatabaseConnectionManager(
//                "jdbc:postgresql://localhost:5433/test",
//                "postgres",
//                "admin"
//        );
//
//        Connection con = dcm.getConnection();
//        System.out.println(con.isClosed());
//
//        Statement stmt = con.createStatement();
//
//        stmt.executeUpdate(
//                """
//                    CREATE TABLE jdbc_test (
//                        id SERIAL PRIMARY KEY,
//                        first_name VARCHAR(25)
//                    );
//                    """
//        );


        StudentManagement sm = new StudentManagement();
//        sm.printAllStudents();

//        sm.deleteAllStudents();
//
//        sm.printAllStudents();

        sm.printAllStudents();
        sm.updateStudentName(6, "John");
        System.out.println("==================================");
        sm.printAllStudents();
    }
}
