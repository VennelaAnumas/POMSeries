package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegister {

	public static void main(String[] args) {

		 WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Actions act= new Actions(driver);
		
		
	}

}
