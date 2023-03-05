package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

		public WebDriver driver;
		
		private By Search =By.xpath("//input[@type='search']");
		private By ProductName=By.cssSelector("tr td:nth-child(1)");
		
		
		public OffersPage(WebDriver driver)
		{
			this.driver=driver;
		}
		
		
		public void searchitem(String name) {
			driver.findElement(Search).sendKeys(name);
		}
		
		public String getproductname() {
			return driver.findElement(ProductName).getText();
		}
	
}
