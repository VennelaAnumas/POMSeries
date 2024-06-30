package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendkeysAndClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act= new Actions(driver);
		Thread.sleep(3000);
		By firstname=By.cssSelector("#input-firstname");
		act.sendKeys(driver.findElement(firstname), "vennela").perform();
		
		
	}

}
