package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {
	static WebDriver driver;
	public static void main(String[] args) {

		
		// 1. .to() methodis overloaded
		//2. get is notoverloaded
		driver= new ChromeDriver();
//		driver.get("https://google.com/");
//	System.out.println(driver.getTitle());
//
	driver.navigate().to("https://www.flipkart.com/");
	System.out.println(driver.getTitle());
	
//	driver.navigate().to(new URL("https://www.flipkart.com/"));not present on java version;
	
//		System.out.println(driver.getPageSource());
//	System.out.println(driver.getTitle());
//	
//	driver.navigate().back();
//	System.out.println(driver.getTitle());
//
//	driver.navigate().forward();
//	System.out.println(driver.getTitle());
//
//	driver.navigate().back();
//	System.out.println(driver.getTitle());
		
	driver.navigate().refresh();// throws stale element excep, not used in between; if page loaded properly etc.. we can use
	
		

	}

}
