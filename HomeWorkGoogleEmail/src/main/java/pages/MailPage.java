package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Anna on 27.03.2016.
 */
public class MailPage extends Page{

    public MailPage(WebDriver driver) {
        super(driver);
    }

	@FindBy(xpath="//*[contains(text(), 'НАПИСАТЬ')]")
	private WebElement writeLetterButton;

    public  MailPage  writeMailPopup(){
        writeLetterButton.click();
        return new MailPage(driver);
    }

	@FindBy(name="to")
	private WebElement receiver;

	@FindBy(name="subjectbox")
	private WebElement subject;

	@FindBy(className="editable")
	private WebElement mailBody;

	@FindBy(xpath="//*[contains(text(), 'Отправить')]")
	private WebElement sendButton;


	@FindBy(className="vh")
	private WebElement messageSend;

	@FindBy(xpath="//*[contains(text(), 'Входящие')]")
	private WebElement inbox;

	@FindBy(xpath=".//div[7]/div[3]//div[2]/div[1]/div[2]//div[2]/div[1]/div[1]//div[7]/div/div[1]/div[2]/div/table/tbody/tr/td[4]/div[2]")
	private WebElement newMessage;


    public void setReseiver(String receiverEmails){
        receiver.sendKeys(receiverEmails);
    }

    public void setSubject(String subjText) {
        subject.sendKeys(subjText);
    }

    public void setMailBody(String mailText){
        mailBody.sendKeys(mailText);
    }

    public String messSendAllert(){
        return messageSend.getText();
    }

    public String inboxMessageCheck(){
        return inbox.getText();
    }

    public  MailPage clickSubmit(){
        sendButton.click();
        return this;
    }

    public void goToSingleMessagePage(){
        newMessage.click();
    }
}
