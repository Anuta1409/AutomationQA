import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Anna on 20.03.2016.
 */
public class OnFailure extends TestListenerAdapter{
    @Step("Hi, I'm step in your testng listener")
    @Override
    public void onTestFailure(ITestResult tr) {
        createAttachment();
    }

    @Attachment("Hi, I'm attachment in your testng listener")
    public String createAttachment() {
        return "My own attachment body!";
    }
}
