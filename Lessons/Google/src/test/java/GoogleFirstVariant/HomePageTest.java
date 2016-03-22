package GoogleFirstVariant;

import Browsers.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

/**
 * Created by Anna on 21.03.2016.
 */
public class HomePageTest {
    private WebDriver driver;

    @BeforeClass
    public void driver(){
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }

    @AfterClass
    public void closesDriver(){
        driver.close();
        driver.quit();
    }


    @Test
    public void testSearchFunction() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.searchFunction("Selenium");

    }

    @org.testng.annotations.Test
    public void testGoToServiceLoginPage() throws Exception {

    }
}