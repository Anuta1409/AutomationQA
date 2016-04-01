package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Anna on 01.04.2016.
 */
public class SingleMessagePage extends Page {

    public SingleMessagePage(WebDriver driver) {
        super(driver);
    }

	@FindBy(className="go")
	private WebElement emailSender;

    public String takeSenderEmail(){
        return emailSender.getText();
    }
}
