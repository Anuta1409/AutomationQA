package SelectData;

import java.sql.*;

/**
 * Created by Anna on 29.02.2016.
 */
public class ConnectionQuery {
    enum Table{s,c,o};

    public ConnectionQuery(String url, String name, String password, String query, String tableName){
        try {
            Connection connection = DriverManager.getConnection(url,name,password);

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


            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
