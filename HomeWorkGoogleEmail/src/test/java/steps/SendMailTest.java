package steps;

import browsers.BrowserFactory;
import browsers.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;


public class SendMailTest {
    private WebDriver driver;


    @BeforeMethod
    public void setup() throws IOException {
        driver = WebDriverFactory.browserSet("firefox");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        LogIn.goToLoginPage(driver);
        LogIn.goToBaseAccount(driver,"chumaktest14091991@gmail.com", "any140991");
        SendMail.goToMailPage(driver);
    }

    @Test(priority = 0)
    public void testSendMail() throws InterruptedException {
        SendMail.writeMail(driver,"chumaktest14091991@gmail.com", "Test","Test");
        Thread.sleep(1000);
        Assert.assertTrue(SendMail.checkResult(driver).contains("отправлено"));
    }


    @Test(priority = 1)
    public void checkMessageInMail() throws InterruptedException {
        Assert.assertTrue(LogIn.checkInbox(driver).contains("1"));
    }

    @Test(priority = 2)
    public void checkReadMessage(){
        ReadMessage.goToSingleMessage(driver);
        Assert.assertEquals(ReadMessage.getSender(driver),"<chumaktest14091991@gmail.com>");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}