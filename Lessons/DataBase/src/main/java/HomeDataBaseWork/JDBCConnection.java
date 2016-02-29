package HomeDataBaseWork;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost/business";
        String password = "ann";
        String name = "Ann";

        try {
            Connection connection = DriverManager.getConnection(url,name,password);
            System.out.println("Connection set");
            connection.close();
            System.out.println("Connection close");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
