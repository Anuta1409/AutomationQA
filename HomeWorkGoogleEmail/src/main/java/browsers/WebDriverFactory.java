package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;

/**
 * * File for default Selenium web-driver settings for different browsers:
 * -FF,
 * -Chrome,
 * -IE-11,
 */
public class WebDriverFactory {

    enum WebBrowser{chrome, firefox, ie};
    static WebDriver driver;

    public static WebDriver browserSet(String browserName) throws IOException {
        WebBrowser access = WebBrowser.valueOf(browserName);
        switch (access) {
            case chrome: {
                    System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
                    WebDriver driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    return driver;
            }
            case firefox: {
                    FirefoxProfile profile = new FirefoxProfile();
                    profile.addExtension(new File("drivers\\firebug-2.0.16-fx.xpi"));
                    FirefoxDriver driver = new FirefoxDriver(profile);
                    driver.manage().window().maximize();
                    return driver;
            }
            case ie: {
                    System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
                    WebDriver driver = new InternetExplorerDriver();
                    driver.manage().window().maximize();
                    return driver;
            }
            default: {
                System.out.println("Browser with this name doesn't exist!!!");
            }
        }
    return driver;
    }

}
