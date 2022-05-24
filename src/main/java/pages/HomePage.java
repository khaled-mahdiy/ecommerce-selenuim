package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Register")
	WebElement RegisterLink;
	
	public void openRegisterPage()
	{
		clickBtn(RegisterLink);
	}
	
	@FindBy(linkText = "Log in")
	WebElement loginLink;
	
	public void openLoginPage()
	{
		clickBtn(loginLink);
	}

	@FindBy(css = "span.cart-label")
	WebElement shoppingCart;
	
	public void openShoppingCart()
	{
		clickBtn(shoppingCart);
	}
	
	@FindBy(css = "span.wishlist-label")
	WebElement wishList;
	
	public void openWishList()
	{
		clickBtn(wishList);
	}
	
	@FindBy(id = "customerCurrency")
	WebElement currenctOptions;
	
	@FindBy(css = "span.price actual-price")
	public WebElement productPrice;
	
	public void ChangeCurrency()
	{
		select = new Select(currenctOptions);
		select.selectByVisibleText("Euro");
		
	}
}
