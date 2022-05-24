package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

	WebDriver driver;
	Select select;
	Actions action;

	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickBtn(WebElement element)
	{
		element.click();
	}
	public void sendKeysToElement(WebElement element,String value)
	{
		element.sendKeys(value);
	}
}
