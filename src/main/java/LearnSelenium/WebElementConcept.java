package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	 static WebDriver driver;
	
	public static void main(String[] args) {

		 driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("vennela1");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2.
//		WebElement emailid =driver.findElement(By.id("input-email"));
//		WebElement pwd= driver.findElement(By.id("input-password"));
//		
//		emailid.sendKeys("vennela2");
//		pwd.sendKeys("test@123");
		
		//3. 
//		By emailid=By.id("input-email");
//		By pwd=By.id("input-password");
//		
//		WebElement emailid_ele=driver.findElement(emailid);
//		WebElement pwd_ele=driver.findElement(pwd);
//		
//		emailid_ele.sendKeys("vennela3");
//		pwd_ele.sendKeys("test@123");
		
		//4.locator + generic functn for webelements
		
//		By emailid=By.id("input-email");
//		By pwd=By.id("input-password");
//		
//		getElement(emailid).sendKeys("vennela4");
//		getElement(pwd).sendKeys("test@123");
		
		//5. by locator + generic functns for webelements and sendkeys
//		By emailid= By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		doSendKeys(emailid,"vennela5");
//		doSendKeys(pwd,"test@123");
		
//		minisendkeys(emailid,"vennela");

		
		//6. by locator + generic functns for webelements and sendkeys: ElementUtil
		By emailid= By.id("input-email");
		By pwd = By.id("input-password");
				
		ElementUtil eleutil=new ElementUtil(driver);
		eleutil.doSendKeys(emailid, "vennela");
		eleutil.doSendKeys(pwd, "test@123");
		
		//7. by locator+ browsr util+ element util
		
	}

	
	
//    public static void minisendkeys(By locator, String value)
//    {
//    	driver.findElement(locator).sendKeys(value);
//    }
	
}
