package pageObjects;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
	
	public LandingPage landingPage;
	public OffersPage offerspage;
	public CheckoutPage checkout;
	public WebDriver driver;
	
	
	public pageObjectManager(WebDriver driver){
		this.driver=driver;
	}
	
	public LandingPage getLandingPage() {
		landingPage= new LandingPage(driver);
		return landingPage;
	}
	
	public OffersPage getOffersPage() {
		offerspage= new OffersPage(driver);
		return offerspage;
	}
	
	public CheckoutPage CheckoutPage() {
		checkout= new CheckoutPage(driver);
		return checkout;
		
	}
}
