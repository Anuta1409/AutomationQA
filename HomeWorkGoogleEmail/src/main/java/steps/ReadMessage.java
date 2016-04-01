package steps;

import org.openqa.selenium.WebDriver;
import pages.MailPage;
import pages.SingleMessagePage;

public class ReadMessage {
    public static WebDriver driver;

    public static SingleMessagePage goToSingleMessage(WebDriver driver){
        MailPage mailPage = new MailPage(driver);
        mailPage.goToSingleMessagePage();
        return new SingleMessagePage(driver);
    }

    public static String getSender(WebDriver driver){
        SingleMessagePage singleMessagePage = new SingleMessagePage(driver);
        return singleMessagePage.takeSenderEmail();
    }
}
