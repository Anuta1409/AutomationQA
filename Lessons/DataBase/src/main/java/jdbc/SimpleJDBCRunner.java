package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Anna on 05.03.2016.
 */
public class SimpleJDBCRunner {
    public static void main(String[] args) throws SQLException {
        Connection cn = null;
        cn = ConnectorDB.getConnection();
        Statement st = null;

        st= cn.createStatement();
        ResultSet rs = null;
        rs = st.executeQuery("Select* from phonebook");

        ArrayList<Abonent> lst = new ArrayList<Abonent>();
        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int phone = rs.getInt(3);
            lst.add(new Abonent(id,phone,name));

        }
        if(lst.size()>0){
            System.out.println(lst);
        }
        cn.close();
    }
}
