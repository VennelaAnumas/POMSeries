package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {
	static WebDriver driver;

	public static void main(String[] args) {

	
			driver=new ChromeDriver();
			driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
			driver.switchTo().frame("");
			driver.switchTo().defaultContent();
	
	}

}
