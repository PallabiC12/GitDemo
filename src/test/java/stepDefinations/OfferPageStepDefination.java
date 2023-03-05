package stepDefinations;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.pageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefination {

	public String OfferPageProdName;
	TestContextSetup testContextSetup;
	pageObjectManager pageobjmanager;
	
	public OfferPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	
	@Then("^user searched for (.+) Short name in Offers page to check if product exist with same name$")
	public void user_searched_for_same_short_name_in_offers_page_to_check_if_product_exist(String Shortname) throws InterruptedException {
		SwitchToOfferPage();
		//pageobjmanager= new pageObjectManager(testContextSetup.driver);
		//pageobjmanager.getLandingPage();
		OffersPage offerspage= testContextSetup.pageobjmanager.getOffersPage();
		//testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Shortname);
		offerspage.searchitem(Shortname);
	    Thread.sleep(2000);
	    OfferPageProdName=offerspage.getproductname();
	    
	}
	
	public void SwitchToOfferPage() {
		//if already switched to offer page or not; then skip the below steps
		//if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"));		
		//testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
		//pageobjmanager= new pageObjectManager(testContextSetup.driver);
		
		LandingPage landingpage=testContextSetup.pageobjmanager.getLandingPage();
		landingpage.SlectTopDealsPage();
		testContextSetup.genericutils.switchwindowchild();    
	    
	}
	
	
	@And("Validate Product name in landing page matches with Offer page")
	public void Validate_Product_name_landing_page_matches_with1_Offer_page() {
	   Assert.assertEquals(OfferPageProdName, testContextSetup.LandingPageProcuctName);
	    
	}
}
