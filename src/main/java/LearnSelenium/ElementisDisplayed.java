package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementisDisplayed {
static WebDriver driver;
	public static void main(String[] args) {

		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailid=By.id("input-email");
		By logo=By.className("img-responsive");
		By frgtpwd=By.linkText("Forgotten Password");
	}
	
	public static void isElementDisplayed(By locator)
	{
		
	}
	
	public static boolean isElementDisplayed(By locator, int ExpectedElementCount)
	{
		int elementcount=driver.findElements(locator).size();
		if(elementcount==ExpectedElementCount)
		{
			System.out.println();
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean doIsDisplayed(By locator)
	{
		try {
			boolean flag=getElement(locator).isDisplayed();
			return flag;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	public static WebElement getElement(By locator)
	{
	 return	driver.findElement(locator);
	}

}
