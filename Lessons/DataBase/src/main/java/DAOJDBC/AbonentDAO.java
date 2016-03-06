package DAOJDBC;

import jdbc.Abonent;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AbonentDAO extends AbstractDAO<Integer, Abonent> {

    public static final String SQL_SELECT_ALL_ABONENTS="Select* from phonebook";
    ResultSet rs=null;
    @Override
    public List<Abonent> findAll() throws SQLException {

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
        return null;
    }

    @Override
    public Abonent findEntityById(Integer Id) {
        return null;
    }

    @Override
    public boolean delete(Abonent entity) {
        return false;
    }

    @Override
    public boolean create(Abonent entity) {
        return false;
    }

    @Override
    public Abonent update(Abonent entity) {
        return null;
    }
}
