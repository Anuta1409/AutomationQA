package GoogleSecondVariant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Anna on 22.03.2016.
 */
public class HomePageElements {
    WebDriver driver;

    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(xpath = ".//*[@id='sblsbb']")
    private WebElement searchButton;

    @FindBy(xpath = ".//*[@id='gb_70']")
    private WebElement goToGoogleAccountButton;

    public HomePageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setSearchQuery(String query){
        searchField.sendKeys(query);
    }

    public void clearSearchQuery(){
        searchField.clear();
    }

    public void clickButton(){
         searchButton.click();
    }

}
