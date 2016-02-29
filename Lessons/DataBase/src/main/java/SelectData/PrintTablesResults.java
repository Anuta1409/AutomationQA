package SelectData;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Anna on 29.02.2016.
 */
public class PrintTablesResults {

    public static void printResultC(ResultSet resultSet) throws SQLException {
        int CNum, Rating, SNum;
        String CName, City;
        System.out.println("_____________________Clients Table______________________________");
        System.out.println("CNum***" +"SNum***"+"Rating***"+"CName***********"+"City***"  );
        while(resultSet.next()){
            CNum = resultSet.getInt("CNum");
            SNum = resultSet.getInt("SNum");
            Rating = resultSet.getInt("Rating");

            CName = resultSet.getString("CName");
            City = resultSet.getString("City");

            System.out.println(CNum+"   "  +SNum+"      "+Rating+"     " +CName+"        " +City);

        }
    }

    public static void printResultS(ResultSet resultSet) throws SQLException {
        int SNum, Age;
        String SName, City;
        double Comm;
        System.out.println("_____________________Servant Table______________________________");
        System.out.println("SNum***" +"SName***" +"Age***"+"City***"+"Comm***********" );
        while(resultSet.next()){
            SNum = resultSet.getInt("SNum");
            Age = resultSet.getInt("Age");
            Comm = resultSet.getDouble("Comm");

            SName = resultSet.getString("SName");
            City = resultSet.getString("City");

            System.out.println(SNum+"   "  +SName+"      "+Age+"     " +City+"        " +Comm);

        }
    }

    public static void printResultO(ResultSet resultSet) throws SQLException {
        int CNum,ONum;
        Date ODate;
        double Summa;
        System.out.println("_____________________Operation______________________________");
        System.out.println("CNum***" +"ODate**********"+"ONum***"+"Summa"  );
        while(resultSet.next()){
            CNum = resultSet.getInt("CNum");
            ONum = resultSet.getInt("ONum");
            ODate = resultSet.getDate("ODate");
            Summa = resultSet.getInt("Summa");

            System.out.println(ONum+"   "  +ODate+"      "+CNum+"     " +Summa);

        }
    }

}
