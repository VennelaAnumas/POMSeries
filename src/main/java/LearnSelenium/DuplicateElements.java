package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateElements {

	// if duplicates are available it will go with first one
	// it won't throw any exception
 static	WebDriver driver;
	public static void main(String[] args) {
		
	    driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.findElement(By.linkText("Forgotten Password")).click();
	By forgetpwdlink=By.linkText("Forgotten Password");
	By loginlink=By.linkText("Login");
	doClick(forgetpwdlink);
	doClick(loginlink);
	}
	
	public static void doClick(By Locator)
	{
		getElement(Locator).click();
	}
	
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);
		
	}
}
