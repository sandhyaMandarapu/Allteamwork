package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author KT1557
 * @CreatedDate 03-05-2023
 * @param This class contains all the methods of login page
 * @outputparam  returns particular datatypes
 */


public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}



	@FindBy(xpath = "//input[@name=\"username\"]")

	private WebElement username;

	@FindBy(xpath = "//input[@type='password']")

	private WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]")

	private WebElement btn;



	//    @FindBy(xpath = "//span[@class=\\\"oxd-userdropdown-tab\\\"]")

	//    private WebElement logout;

	public WebElement getUsername() {

		return username;
	}

	public WebElement getPassword() {

		return password;
	}

	public void logIn(String user,String pass)
	{
		username.sendKeys(user);

		password.sendKeys(pass);

		btn.click();
	}
}




