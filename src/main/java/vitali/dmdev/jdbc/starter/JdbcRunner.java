package vitali.dmdev.jdbc.starter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRunner {
    public static void main(String[] args) {
        String sql = """
                create 
                """;
        try (Connection connection = DriverManager.getConnection(DatabaseProperties.URL,
                DatabaseProperties.USER, DatabaseProperties.PASS);
             Statement statement = connection.createStatement()) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
