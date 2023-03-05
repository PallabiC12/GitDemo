package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}
	public void switchwindowchild() {
		Set <String> WinHan=driver.getWindowHandles();
	    Iterator<String> i1=WinHan.iterator();
	    String ParentWindow=i1.next();
	    String ChildWindow=i1.next();
	    driver.switchTo().window(ChildWindow);
	}
}
