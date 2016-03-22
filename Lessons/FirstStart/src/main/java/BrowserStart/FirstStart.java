package BrowserStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstStart {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://github.com/Anuta1409");
    }
}
