package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandling {
	static WebDriver	driver;
	public static void main(String[] args) {

    	driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20");
		
		By inputlimit=By.id("input-limit");
		
		Select select_limit= new Select(driver.findElement(inputlimit));
		select_limit.selectByIndex(0);
		select_limit.selectByValue("https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18&limit=50");
		select_limit.selectByVisibleText("75");
		
	}
	
	
	public static WebElement getelement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator)
	{
		
	}
}
