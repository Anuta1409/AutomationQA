package DAOJDBC;

import java.sql.SQLException;

/**
 * Created by Anna on 05.03.2016.
 */
public class MainDAO {
    public static void main(String[] args) throws SQLException {
        AbonentDAO abonentDAO = new AbonentDAO();
        abonentDAO.findAll();
    }
}
