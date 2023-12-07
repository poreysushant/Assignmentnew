package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
public WebDriver driver;
	@FindBy(xpath="//*[@type='text']") private WebElement searchtab;
	
	@FindBy(xpath="//*[@id='nav-search-submit-button']") private WebElement searchbtn;
	
	@FindBy(xpath="//*[@class='puisg-col-inner']//*[text()='Apple iPhone 15 (128 GB) - Black']")
	private WebElement iphone;
	
	@FindBy(xpath="//*[@id=\"corePriceDisplay_desktop_feature_div\"]/child::div[@class='a-section a-spacing-none aok-align-center']/descendant::span[@class='a-offscreen']")
	private WebElement price;

	@FindBy(xpath="//div[@class='a-section a-spacing-none a-padding-none']//input[@title='Add to Shopping Cart']")
	private WebElement AddtoCart;
	
	public HomePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 public void searchTab(String ip)
 {
	 searchtab.sendKeys(ip);
 }
public void clickOnsearchbutton()
{
	searchbtn.click();	
}
public void clickOnIphone()
{
	iphone.click();
}
public String getPrice()
{
	String text=price.getText();
	return text;
}
public void ClickOnAddToCartbtn()
{
	AddtoCart.click();	
}
}
