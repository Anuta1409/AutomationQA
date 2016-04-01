package steps;

import log4j.Config;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.BaseAccountPage;
import pages.BasePage;
import pages.LoginPage;
import pages.MailPage;

public class LogIn {

   // public static Config conf = new Config();

    public  static LoginPage goToLoginPage(WebDriver driver){
        //Logger logger = conf.initLogger("Go to User's mail Page");
        BasePage basePage = new BasePage(driver);
        basePage.clickLogin();
        return new LoginPage(driver);
    }

    public static BaseAccountPage goToBaseAccount(WebDriver driver, String email, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.addEmail(email);
        loginPage.clickNext();
        loginPage.addPassword(password);
        loginPage.clickSubmit();
        return new BaseAccountPage(driver);
    }

    public static String checkInbox(WebDriver driver){
        MailPage mailPage = new MailPage(driver);
        return mailPage.inboxMessageCheck();
    }


}
