package stepDefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class CheckOutPageStepDefination {
	public WebDriver driver;
	public String LandingPageProcuctName;
	public String OfferPageProdName;
	public CheckoutPage checkoutPage; 
	TestContextSetup testContextSetup;
	
	public CheckOutPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.checkoutPage=testContextSetup.pageobjmanager.CheckoutPage();
	}
	@Then("verify that user can enter Promo code and place order")
	public void verify_that_user_can_enter_Promo_code_and_place_order() {
		//checkoutPage=testContextSetup.pageobjmanager.CheckoutPage();
		Assert.assertTrue(checkoutPage.verifyPromoBtn());
		Assert.assertTrue(checkoutPage.PlaceOrder());
	}
	
	@Then("^user proceed and validate (.+) product in checkout page$")
	public void User_proceed_to_checkout(String name) throws InterruptedException {
		checkoutPage.CheckOutBag();
		//Thread.sleep(2000);
		//Assert.assertEquals(checkoutPage.getCheckOutProduct(), name);
	}
	
	
	
}
