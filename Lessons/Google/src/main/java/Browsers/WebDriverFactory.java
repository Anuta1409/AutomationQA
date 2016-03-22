package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * * File for default Selenium web-driver settings for different browsers:
 * -FF,
 * -Chrome,
 * -IE-11,
 */
public class WebDriverFactory {

    enum WebBrowser{chrome, firefox, ie};
    static WebDriver driver;

    public static WebDriver browserSet(String browserName){
        WebBrowser access = WebBrowser.valueOf(browserName);
        switch (access) {
            case chrome: {
                    System.setProperty("webdriver.chrome.driver", "..\\Project\\resources\\chromedriver.exe");
                    WebDriver driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    return driver;
            }
            case firefox: {
                    WebDriver driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    return driver;
            }
            case ie: {
                    System.setProperty("webdriver.ie.driver", "..\\Project\\resources\\IEDriverServer.exe");
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
