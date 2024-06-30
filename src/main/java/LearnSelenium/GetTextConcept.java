package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {
 static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//	String header=	driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
		
	
		By tname=By.tagName("h2");
		ElementUtil e1=new ElementUtil(driver);
		e1.doGetText(tname);
		System.out.println(e1.doGetText(tname));
	
	}
	
	
}
