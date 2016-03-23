package GoogleSecondVariant;

import GoogleFirstVariant.ResultPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import  log4j.Config;

public class HomePage {
    WebDriver driver;

    private static String LOG_PROPERTIES_FILE = "log4j.properties";
    private static Logger logger = Logger.getLogger(HomePage.class.getName());

    Config config = new Config(LOG_PROPERTIES_FILE);

    public ResultPage searchFunction(String searchQuery) throws InterruptedException {
        logger.info("Create Home Page Elements object");
        HomePageElements homePageElements = new HomePageElements(driver);
        logger.info("Enter search queries");
        homePageElements.setSearchQuery(searchQuery);
        logger.info("Click on the button");
        homePageElements.clickButton();
        Thread.sleep(2000);
        logger.info("Clear search fields");
        homePageElements.clearSearchQuery();
        logger.info("Return new Result Page");
        return new ResultPage(driver);
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
}
