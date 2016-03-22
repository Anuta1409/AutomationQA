package GoogleSecondVariant;

import Browsers.BrowserFactory;
import Browsers.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

/**
 * Created by Anna on 22.03.2016.
 */
public class HomePageTest {
    WebDriver driver;
    @BeforeTest
    public void driverOpen(){
        driver = BrowserFactory.getBrowser("Firefox");
        driver.get("https://www.google.com");
    }

    @DataProvider
    private Object[][] searchQuery(){
        return new Object[][]{{"Selenium"},{"Test"},{"Java"}};
    }


    @Test(dataProvider = "searchQuery")
    public void testSearchFunction(String query) throws InterruptedException {
        GoogleSecondVariant.HomePage homePage = new GoogleSecondVariant.HomePage(driver);
        homePage.searchFunction(query);

    }

    @AfterClass
    public void tearDown(){
        BrowserFactory.closeAllDriver();
    }


}