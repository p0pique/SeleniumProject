package testService.jdbcService;

import org.modelmapper.ModelMapper;

import java.sql.*;

public class DbService {
    static ModelMapper mapper = new ModelMapper();

    public static void connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sys", "root", "my-secret-pw");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from store");
            resultSet.next();
            System.out.println(resultSet.getObject("name"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
