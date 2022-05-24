package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase{

	public WishListPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(tagName = "h1")
	public WebElement wishListHeader;
	
	@FindBy(css = "a.product-name")
	public WebElement productName;
	
	@FindBy(css = "td.remove-from-cart")
	WebElement removeBtn;
	
	@FindBy(css = "div.no-data")
	public WebElement noData;
	
	public void userCanRemoveElementFromWishList()
	{
		clickBtn(removeBtn);
	}
}
