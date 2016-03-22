package GoogleSecondVariant;

import GoogleFirstVariant.ResultPage;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public ResultPage searchFunction(String searchQuery) throws InterruptedException {
        HomePageElements homePageElements = new HomePageElements(driver);
        homePageElements.setSearchQuery(searchQuery);
        homePageElements.clickButton();
        Thread.sleep(2000);
        homePageElements.clearSearchQuery();
        return new ResultPage(driver);
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
}
