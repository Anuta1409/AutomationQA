import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Anna on 20.03.2016.
 */
public class WebDriverSteps {
    public WebDriver driver;

    public WebDriverSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void openMainPage() {
        driver.get("http://ya.ru");
    }

    @Step("Search by \"{0}\"")
    public void search(String text) {
        driver.findElement(By.id("text")).sendKeys(text);
        driver.findElement(By.className("suggest2-form__button")).submit();
    }

    @Attachment
    public byte[] makeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public void quit() {
        driver.quit();
    }
}
