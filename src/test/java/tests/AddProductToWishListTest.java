package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductPage;
import pages.WishListPage;
import pages.userSearchForProduct;

public class AddProductToWishListTest extends TestBase {
	HomePage homePageObject;
	userSearchForProduct userSearchObject;
	WishListPage wishPageObject;
	ProductPage productPageObject;
	
	

	@Test
	public void userCanAddProductToWishList() throws InterruptedException
	{
		userSearchObject= new userSearchForProduct(TestBase.driver);
		userSearchObject.userCanSearchWithAutoSuggest("MacBo");

		productPageObject = new ProductPage(TestBase.driver);
		productPageObject.AddProductToWishList();
		
		homePageObject = new HomePage(TestBase.driver);
		homePageObject.openWishList();
		
		wishPageObject = new WishListPage(TestBase.driver);
		Assert.assertTrue(wishPageObject.wishListHeader.getText().contains("Wishlist"));
		Assert.assertTrue(wishPageObject.productName.getText().contains("Apple MacBook Pro 13-inch"));
		wishPageObject.userCanRemoveElementFromWishList();
		Assert.assertTrue(wishPageObject.noData.getText().contains("The wishlist is empty!"));

		
	}
}
