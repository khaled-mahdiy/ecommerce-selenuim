package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.RegisterationPage;

public class UserRegisterationTest extends TestBase{
	HomePage homePageObject;
	RegisterationPage registerPageObject;
	
	Faker faker = new Faker();
	String firstName = faker.name().firstName();
	String lastName = faker.name().lastName();
	String email = faker.internet().emailAddress();
	String password = faker.number().digits(8).toString();
	
	@Test(priority = 1)
	public void userCanRegisterSuccssfully() throws InterruptedException
	{
		homePageObject = new HomePage(TestBase.driver);
		homePageObject.openRegisterPage();
		registerPageObject = new RegisterationPage(TestBase.driver);
		registerPageObject.userCanRegister(firstName, lastName, email, password);
		Assert.assertTrue(registerPageObject.resultMessage.getText().equals("Your registration completed"));
	}
	
	@Test(priority = 2)
	public void userLogout()
	{
		registerPageObject.userLogout();
	}
	
	@Test(priority = 3)
	public void userLogin() throws InterruptedException
	{
		homePageObject.openLoginPage();
		registerPageObject.userLogin(email, password);
		Assert.assertTrue(registerPageObject.logoutLink.isDisplayed());
		Thread.sleep(3000);
	}
	
}
