package SelectData;

/**
 * Created by Anna on 29.02.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        ConnectionQuery connectionQuerC = new ConnectionQuery("jdbc:mysql://localhost/business", "Ann", "ann","SELECT * FROM c", "c");
        ConnectionQuery connectionQueryS = new ConnectionQuery("jdbc:mysql://localhost/business", "Ann", "ann","SELECT * FROM s", "s");
        ConnectionQuery connectionQueryO = new ConnectionQuery("jdbc:mysql://localhost/business", "Ann", "ann","SELECT * FROM o","o");
    }
}
