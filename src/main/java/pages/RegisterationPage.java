package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterationPage extends PageBase{

	public RegisterationPage(WebDriver driver) {
		super(driver);
	}
	

	
	
	@FindBy(id = "gender-male")
	WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement firstNameTextBox;
	
	@FindBy(id="LastName")
	WebElement lastNameTextBox;
	
	@FindBy(id="Email")
	WebElement emailTextBox;
	
	@FindBy(id="Password")
	WebElement PasswordTextBox;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPasswordTextBox;
	
	@FindBy(id = "register-button")
	WebElement registerBtn;
	
	@FindBy(css = "div.result")
	public WebElement resultMessage;

	
	public void userCanRegister(String firstName , String lastName, String email, String password)
	{
		sendKeysToElement(firstNameTextBox, firstName);
		sendKeysToElement(lastNameTextBox, lastName);
		sendKeysToElement(emailTextBox, email);
		sendKeysToElement(PasswordTextBox, password);
		sendKeysToElement(confirmPasswordTextBox, password);
		clickBtn(registerBtn);
		
	}
	
	@FindBy(linkText = "Log out")
	public WebElement logoutLink;
	
	public void userLogout()
	{
		clickBtn(logoutLink);
	}
	
	@FindBy(id = "Email")
	WebElement emailLoginTextBox;
	
	@FindBy(id = "Password")
	WebElement PasswordLoginTextBox;
	
	@FindBy(css = "button.button-1.login-button")
	WebElement LoginBtn;
	
	public void userLogin(String email,String password)
	{
		sendKeysToElement(emailLoginTextBox, email);
		sendKeysToElement(PasswordLoginTextBox, password);
		clickBtn(LoginBtn);
	}
	
}
