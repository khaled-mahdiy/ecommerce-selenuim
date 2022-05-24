package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductPage;
import pages.userSearchForProduct;

public class AddProductTest extends TestBase{

	userSearchForProduct userSearchObject;
	HomePage homePageObject;
	ProductPage productPageObject;
	
	
	@Test
	public void userCanSearchAndAddProductsToShoppingCart() throws InterruptedException
	{
		userSearchObject = new userSearchForProduct(TestBase.driver);
		userSearchObject.userCanSearchWithAutoSuggest("macb");
		
		productPageObject = new ProductPage(TestBase.driver);
		productPageObject.AddProductToCart();
		
		homePageObject = new HomePage(TestBase.driver);
		homePageObject.openShoppingCart();
		Assert.assertTrue(productPageObject.cartHeader.getText().contains("Shopping cart"));
	}
}
