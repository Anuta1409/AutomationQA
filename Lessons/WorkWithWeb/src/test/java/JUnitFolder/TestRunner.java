package JUnitFolder;

import com.sun.net.httpserver.Authenticator;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Anna on 13.03.2016.
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Test_a.class);
        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }
    }
}
