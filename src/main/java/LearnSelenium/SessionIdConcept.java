package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIdConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.com/");
		System.out.println("title="+driver.getTitle());
		System.out.println("url="+driver.getCurrentUrl());
		driver.close();
		
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		driver.getCurrentUrl();//null Session ID is null NoSuchSessionException
	}

}
