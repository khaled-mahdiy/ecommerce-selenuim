package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductPage;
import pages.userSearchForProduct;

public class UserChangeCurrency extends TestBase{

	HomePage homePageObject;
	userSearchForProduct userSearchObject;
	ProductPage productPageObject;
	@Test
	public void usreCanChangeCurrency() throws InterruptedException
	{
	
			homePageObject = new HomePage(TestBase.driver);
			homePageObject.ChangeCurrency();
			
			userSearchObject = new userSearchForProduct(TestBase.driver);
			userSearchObject.userCanSearchWithAutoSuggest("MacBook ");
			
			productPageObject= new ProductPage(TestBase.driver);
			Assert.assertTrue(productPageObject.ProductPrice.getText().equals("€1548.00"));
		}
}
