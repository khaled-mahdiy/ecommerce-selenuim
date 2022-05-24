package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.userSearchForProduct;

public class UserSearchTest extends TestBase{

	userSearchForProduct userSearchPageObject;
	
	@Test(enabled = false)
	public void userCanSearchforProduct()
	{
		userSearchPageObject = new userSearchForProduct(TestBase.driver);
		userSearchPageObject.userDoSearch("Apple MacBook Pro 13-inch");
		Assert.assertTrue(userSearchPageObject.productHeader.getText().equals("Apple MacBook Pro 13-inch"));
	}
	
	@Test
	public void userCanSearchforProductWithSuggestMenu() throws InterruptedException
	{
		userSearchPageObject = new userSearchForProduct(TestBase.driver);
		userSearchPageObject.userCanSearchWithAutoSuggest("MacBook");
		Assert.assertTrue(userSearchPageObject.productHeader.getText().equals("Apple MacBook Pro 13-inch"));
	}
}
