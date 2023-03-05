package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	private By Search =By.xpath("//input[@type='search']");
	private By ProductName=By.cssSelector("h4.product-name");
	By increment= By.cssSelector("a.increment");
	By AddtoCart=By.xpath("//div[@class='product-action']/button[contains(text(), 'ADD TO CART')]");
	By TopDeals=By.linkText("Top Deals");
	
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void searchitem(String name) {
		driver.findElement(Search).sendKeys(name);
	}
	
	public String getproductname() {
		return driver.findElement(ProductName).getText();
	}
	public void SlectTopDealsPage() {
		driver.findElement(TopDeals).click();
	}
	
	public String getTitleLandingPage() {
		return driver.getTitle();
	}
	
	public void AddItemProduct(int quantity) {
		int i=quantity-1;
		while(i>0) 
		{
			driver.findElement(increment).click();
			
			i--;
		}
		
	}
	public void AddtoCart() {
		driver.findElement(AddtoCart).click();
	}
}
