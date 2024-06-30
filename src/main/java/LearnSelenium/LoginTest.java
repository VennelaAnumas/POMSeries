package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {

		BrowserUtil brutil= new BrowserUtil();
		WebDriver driver=brutil.LaunchBrowser("chrome");  // returning driver to use it in this class
		brutil.LaunchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil eleutil=new ElementUtil(driver);
		By emailid=By.id("input-email");
		By pwd=By.id("input-password");
		eleutil.doSendKeys(emailid, "vennela");
		eleutil.doSendKeys(pwd, "test@123");
		
		
		
	}

}
