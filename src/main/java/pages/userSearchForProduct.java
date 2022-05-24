package pages;
//Apple MacBook Pro 13-inch

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class userSearchForProduct extends PageBase{

	
	public userSearchForProduct(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "small-searchterms")
	WebElement searchTextBox;
	
	@FindBy(css = "button.button-1.search-box-button")
	WebElement searchBtn;
	
	@FindBy(linkText = "Apple MacBook Pro 13-inch")
	WebElement productLink;
	
	@FindBy(tagName = "h1")
	public WebElement productHeader;
	public void userDoSearch(String productName)
	{
		sendKeysToElement(searchTextBox, productName);
		clickBtn(searchBtn);
		clickBtn(productLink);
	}
	
	@FindBy(id = "ui-id-1")
	WebElement searchMenu;
	
	public void userCanSearchWithAutoSuggest(String productName) throws InterruptedException
	{
		sendKeysToElement(searchTextBox, productName);
		Thread.sleep(1000);
		clickBtn(searchMenu);
	}
}
