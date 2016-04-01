package steps;

import log4j.Config;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.*;


/**
 * Created by Anna on 28.03.2016.
 */
public class SendMail{


    public static MailPage  goToMailPage(WebDriver driver){
        BaseAccountPage baseAccountPage = new BaseAccountPage(driver);
        baseAccountPage.chooseEmail();
        return new MailPage(driver);
    }

    public static MailPage writeMail(WebDriver driver,String recipients,String subject,String body){
        MailPage mailPage = new MailPage(driver);
        mailPage.writeMailPopup();
        mailPage.setReseiver(recipients);
        mailPage.setSubject(subject);
        mailPage.setMailBody(body);
        mailPage.clickSubmit();
        return new MailPage(driver);
    }

    public static String checkResult(WebDriver driver){
        MailPage mailPage = new MailPage(driver);
        return mailPage.messSendAllert();
    }



}
