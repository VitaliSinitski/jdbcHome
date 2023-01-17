package vitali.dmdev.dao.dao;

import vitali.dmdev.dao.dto.FilmFilter;
import vitali.dmdev.dao.util.DaoUtils;
import vitali.dmdev.dao.util.DatabaseProperties;
import vitali.dmdev.dao.vo.Film;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FilmDao {

    public static final String DELETE_SQL = """
            delete from film 
            where id = ?
            """;

    public boolean delete(int id) {
        Connection connection = DaoUtils.getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_SQL)) {
            preparedStatement.setInt(1, id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public List<Film> findAll(FilmFilter filter) {
        try (Connection connection = DriverManager.getConnection(DatabaseProperties.URL,
                DatabaseProperties.USER, DatabaseProperties.PASS)) {
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
