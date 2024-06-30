package LearnSelenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver= new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);

			
			Actions act= new Actions(driver);
			
			//partial scrolling
			act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("book").sendKeys(Keys.ENTER).perform();
			Thread.sleep(3000);
			act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).sendKeys(Keys.ARROW_UP);
	}

}
