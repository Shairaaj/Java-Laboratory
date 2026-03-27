import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Main{
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Example connection string for an imaginary database
            String url = "jdbc:mysql://localhost:3306/NonExceptionDB";
            String user = "root";
            String password = "root";
            
            // Attempt to establish a connection (this is a common point for SQLException)
            conn = DriverManager.getConnection(url, user, password);
            
            // Further database operations would go here
            // stmt = conn.createStatement();
            // ...
            
        } catch (SQLException e) {
            // Catch and handle the SQL exception
            System.out.println("SQLException caught:");
            System.out.println("Message: " + e.getMessage()); // Get the error description
            System.out.println("SQLState: " + e.getSQLState()); // Get the SQLState code
            System.out.println("VendorError: " + e.getErrorCode()); // Get the vendor-specific error code
            // e.printStackTrace();
        } finally {
            // Ensure resources are closed
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}