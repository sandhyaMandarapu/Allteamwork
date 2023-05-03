package pomPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author KT1547
 * @CreatedDate 03-05-2023
 * @param This class contains all the java specific generic methods
 * @outputparam  returns particular datatypes
 */


public class HomePage {
	WebDriver driver;
	//rule-1 create a separate class

	//rule-2 find the elements by using @findby annotation
	//webelement for Add button

	@FindBy(xpath="//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
	private WebElement Addbutton;

	//webelement for select domain

	@FindBy(xpath="//div[@class='oxd-select-text-input'][1]")
	private WebElement search;
	//select from the select class

	//webelement for typeforhits
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement Typeforhints;

	//webelement for select tag
	@FindBy(xpath="//div[text()=\"-- Select --\"][2]")
	private WebElement search2;

	//webelement for username
	@FindBy(xpath="//input[@class=\"oxd-input oxd-input--active\"][2]")
	private WebElement username;

	//webelement for password
	@FindBy(xpath="//input[@type='password'][1]")
	private WebElement password;

	//webelement for confirmpw
	@FindBy(xpath="//input[@type='password'][2]")
	private WebElement confirmpassword;

	//3.create getters method for webelements
	public WebElement getTypeforhints( ) {
		return Typeforhints;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword(String repw) {
		return confirmpassword;
	}

	//4.create driver instance

	public HomePage(WebDriver driver){

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//Business library
	public void homepagedetails(String hints, String uname, String pword, String repeat )
	{
		Typeforhints.sendKeys(hints);
		username.sendKeys(uname);
		password.sendKeys(pword);
		confirmpassword.sendKeys(repeat);
	}
}

