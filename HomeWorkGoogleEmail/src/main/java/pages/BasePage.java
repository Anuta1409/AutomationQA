package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Google Base Page extends from Page
 */
public class BasePage extends Page{

    @FindBy(name = "q")
    private WebElement searchField;

	@FindBy(xpath=".//*[@id='gb_70']")
	private WebElement logIn;


    public BasePage(WebDriver driver) {
        super(driver);
    }

    public void clickLogin(){
        logIn.click();
    }

}
