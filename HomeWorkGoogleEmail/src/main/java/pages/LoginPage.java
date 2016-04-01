package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

/**
 * Created by Anna on 27.03.2016.
 */
public class LoginPage extends Page {

	@FindBy(xpath=".//*[@id='Email']")
	private WebElement emailInput;

	@FindBy(xpath=".//*[@id='Passwd']")
	private WebElement password;

	@FindBy(xpath=".//*[@id='next']")
	private WebElement nextButton;


	@FindBy(xpath=".//*[@id='signIn']")
	private WebElement submitButton;

	public void addEmail(String email){
		emailInput.clear();
		emailInput.sendKeys(email);
	}

	public void clickNext(){
		nextButton.click();
	}

	public void addPassword( String pass){
		password.clear();
		password.sendKeys(pass);
	}

	public void clickSubmit(){
		submitButton.click();
	}


	public LoginPage(WebDriver driver) {
		super(driver);
	}



}
