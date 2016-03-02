package SelectData;

/**
 * Created by Anna on 29.02.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        ConnectionQuery connectionQuery = new ConnectionQuery("jdbc:mysql://localhost/business", "Ann", "ann");
        connectionQuery.selectQuery("SELECT * FROM c", "c");
        connectionQuery.selectQuery("SELECT * FROM s", "s");
        connectionQuery.selectQuery("SELECT * FROM o", "o");
        connectionQuery.finalize();
    }
}
