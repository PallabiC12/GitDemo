package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	public WebDriver driver;
	
	 By CartBag =By.cssSelector("[alt='Cart']");
	 By CheckOutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	 By ApplyPromoButton=By.xpath("//button[contains(text(),'Apply')]");
	 By PlaceOrderButton=By.xpath("//button[contains(text(),'Place Order')]");
	 By CheckOutProduct=By.xpath("//table[@id='productCartTables']/tbody/tr/td/p[@class='product-name']");

	
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}

	public void CheckOutBag() {
		driver.findElement(CartBag).click();
		driver.findElement(CheckOutButton).click();
		
	}
	
	public Boolean verifyPromoBtn() {
		return driver.findElement(ApplyPromoButton).isDisplayed();
	}
	
	public boolean PlaceOrder() {
		return driver.findElement(PlaceOrderButton).isDisplayed();
	}
	
	public String getCheckOutProduct() {
		return driver.findElement(CheckOutProduct).getText();
	}
	
}
