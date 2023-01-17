package vitali.dmdev.dao.util;


import java.sql.Connection;
import java.sql.DriverManager;

public class DaoUtils {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DatabaseProperties.URL,
                    DatabaseProperties.USER, DatabaseProperties.PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(AutoCloseable auto){
        if (auto != null) {
            try {
                auto.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }





}
