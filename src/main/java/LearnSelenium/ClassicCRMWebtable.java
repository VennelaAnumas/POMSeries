package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMWebtable {
	static WebDriver driver;
	public static void main(String[] args) {

		 driver= new ChromeDriver();
		 driver.get("https://classic.freecrm.com/");
		
	}

}
