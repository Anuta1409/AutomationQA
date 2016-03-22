package JUnitFolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Anna on 13.03.2016.
 */
public class WebDriverFactory {

    public static WebDriver getWebDRiverInstance() {
      WebDriver driver = null;
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

}
