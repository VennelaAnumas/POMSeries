package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//	// 1. id : uinique attribute
//		driver.findElement(By.id("input-email")).sendKeys("vennela");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
//		
//	//2. name
//		driver.findElement(By.name("email")).sendKeys("vennela-name");
//	//3. class name 
//		driver.findElement(By.className("")).sendKeys("");
//	//4. xpath : not attribute. xpath is the address of element in html DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vennela");
//	
//	//5. css Selector: its not an attribute.
//	 //css: cascaded style sheet
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("vennela");
//		
//	//6.Linktext: only for a tags
//		driver.findElement(By.linkText("Forgotten Password")).click();
	//7.partial linktext
//		driver.findElement(By.partialLinkText("Delivery")).click();
		
	//8. tagname: html tag
		String header=driver.findElement(By.tagName("h2")).getText();
	System.out.println(header);
	}

}
