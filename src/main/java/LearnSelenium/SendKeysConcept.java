package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {
static WebDriver driver;
	public static void main(String[] args) {

		// null without doublequotes
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	   // driver.findElement(By.id("input-email")).sendKeys(null); //exception illegal argument
	
	    String name="vennela";
	    String desg="QA";
	    StringBuilder sb = new StringBuilder("Automation");
	    StringBuffer sf= new StringBuffer("Selenium");
	    driver.findElement(By.id("input-email")).sendKeys(name,"  ",desg,"google",sb,sf);
	
	
	
	
	}

}
