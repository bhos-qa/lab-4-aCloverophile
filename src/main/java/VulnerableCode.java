import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class VulnerableCode {

    public void vulnerableLogin(String username, String password) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "pass");
            Statement stmt = conn.createStatement();

            // Vulnerable to SQL Injection
            String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
            stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
