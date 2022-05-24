package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase{

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "add-to-cart-button-4")
	WebElement AddToCartBtn;
	
	@FindBy(tagName = "h1")
	public WebElement cartHeader;
	
	public void AddProductToCart()
	{
		clickBtn(AddToCartBtn);
	}
	
	@FindBy(id = "add-to-wishlist-button-4")
	WebElement AddToWishList;
	
	public void AddProductToWishList()
	{
		clickBtn(AddToWishList);
	}

	@FindBy(id = "price-value-4")
	public WebElement ProductPrice;
}
