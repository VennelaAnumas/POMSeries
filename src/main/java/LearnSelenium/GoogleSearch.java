package LearnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		 driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("naveen automation labs");
		Thread.sleep(3000);
		
	By locator=	By.xpath("//ul[@class='G43f7e']/li//div[@class='wM6W7d']/span");
	}
	
	
	

public static void doSearch(By locator)
{
	List<WebElement> sugglist=	driver.findElements(locator);
	for (WebElement e : sugglist) {
		String text=e.getText();
		System.out.println(text);
}}
}