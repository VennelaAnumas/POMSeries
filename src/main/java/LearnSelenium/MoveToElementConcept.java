package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

	 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		WebElement ele=driver.findElement(By.partialLinkText("Laptops & Notebooks"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).click().perform();
		By ele2=By.xpath("//a[contains(text(),'Macs')]");
		Thread.sleep(3000);
		act.click(driver.findElement(ele2)).perform();
		
		

		
		
		
		
		
	}

}
