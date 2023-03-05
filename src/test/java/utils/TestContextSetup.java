package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.pageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String LandingPageProcuctName;
	public pageObjectManager pageobjmanager;
	public TestBase testbase;
	public GenericUtils genericutils;
	
	public TestContextSetup() throws IOException {
		testbase= new TestBase();
		pageobjmanager= new pageObjectManager(testbase.WebDriverManager());
		genericutils = new GenericUtils(testbase.WebDriverManager());
		
	}
}
