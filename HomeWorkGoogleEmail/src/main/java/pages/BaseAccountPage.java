package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Anna on 30.03.2016.
 */
public class BaseAccountPage extends Page {

	@FindBy(xpath=".//*[@id='gbw']//div[1]/div[2]/a")
	private WebElement email;

    public void chooseEmail(){
        email.click();
    }

    public BaseAccountPage(WebDriver driver) {
        super(driver);
    }
}
