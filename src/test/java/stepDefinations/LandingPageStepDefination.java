package stepDefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefination {
	public WebDriver driver;
	public String LandingPageProcuctName;
	public String OfferPageProdName;
	LandingPage landingpage;
	TestContextSetup testContextSetup;
	
	public LandingPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.landingpage= testContextSetup.pageobjmanager.getLandingPage();
	}
	
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		Assert.assertTrue(landingpage.getTitleLandingPage().contains("GreenKart"));
	}
	
	
	@When("^user searched for Short name (.+) and extracted actual name of product$")
	public void user_searched_for_short_name_and_extracted_actual_name_of_product(String Shortname) throws InterruptedException {
	    
		
		landingpage.searchitem(Shortname);
		//testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Shortname);
		Thread.sleep(2000);
		testContextSetup.LandingPageProcuctName=landingpage.getproductname().split("-")[0].trim();
		System.out.println("Product name from Home page is extracted as: "+testContextSetup.LandingPageProcuctName);
	}
	
	//And Added "3" times the product to cart
	@When("Added {string} times the product to cart")
	public void Added_iterms_product(String quantity) {
		
		landingpage.AddItemProduct(Integer.parseInt(quantity));
		landingpage.AddtoCart();
		
	}
	
	
}
