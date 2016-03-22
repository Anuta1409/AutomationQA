import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Anna on 20.03.2016.
 */
public class SearchTest {
    private WebDriverSteps steps;

    @BeforeMethod
    public void setUp() throws Exception {
        steps = new WebDriverSteps(
                new PhantomJSDriver(new DesiredCapabilities())
        );
    }


    @Test
    public void searchTest() throws Exception {
        steps.openMainPage();
        steps.search("Yandex QATools");
        steps.makeScreenshot();
        steps.quit();
    }
}
