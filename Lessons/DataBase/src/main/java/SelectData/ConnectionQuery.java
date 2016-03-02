package SelectData;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Anna on 29.02.2016.
 */
public class ConnectionQuery {
    
    enum Table{s,c,o};
     Connection connection;
             
    public ConnectionQuery(String url, String name, String password){
        try {
            connection = DriverManager.getConnection(url,name,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void selectQuery(String query, String tableName){
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            Table table = Table.valueOf(tableName);
            switch (table){
                case s:{
                    PrintTablesResults.printResultS(rs);
                }break;
                case c:{
                    PrintTablesResults.printResultC(rs);
                }break;
                case o:{
                    PrintTablesResults.printResultO(rs);
                }break;
                default:
                    System.out.println("Table doesn't exist on the DB");
            }       
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateQuery(String query){
        try {
            Statement st = connection.createStatement();
            st.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public void finalize(){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
