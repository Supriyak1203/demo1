import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class SQLExceptionDemo {
    public static void main(String[] args) {
        try {
            
            Connection con = DriverManager.getConnection(
                "localhost:3306/wrongDB", "root", "password"
            );
        } catch (SQLException e) {
            System.out.println("SQL Exception Occur: " + e.getMessage());
        }
    }
}
