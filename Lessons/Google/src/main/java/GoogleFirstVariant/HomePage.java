package GoogleFirstVariant;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class HomePage {
    WebDriver driver;

    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(xpath = ".//*[@id='sblsbb']")
    private WebElement searchButton;

    @FindBy(xpath = ".//*[@id='gb_70']")
    private Button goToGoogleAccountButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public ResultPage searchFunction(String searchQuery) throws InterruptedException {
        searchField.sendKeys(searchQuery);
        searchButton.click();

        return new ResultPage(driver);
    }

    public ServiceLoginPage goToServiceLoginPage(){
        searchButton.click();
        return new ServiceLoginPage();
    }


}
