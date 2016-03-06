package SelectData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Anna on 03.03.2016.
 */
public class PreparedStatementClass {

    public static PreparedStatement getPreparedStatement(String sql) throws SQLException {
        PreparedStatement ps = null;
        Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost/business", "Ann", "ann");
        ps = connection.prepareStatement(sql);
        return ps;
    }
}
