package LearnSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeList {
	 static WebDriver driver;

	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		ElementUtil eleutil= new ElementUtil(driver);
		By images= By.tagName("img");
		By links=By.tagName("a");

//		getElementAttributeList(images, "src");
//		System.out.println("-------------------------------");
//		getElementAttributeList(images, "alt");
//		System.out.println("----------------------------------");
	
		eleutil.getElementAttributeList(links, "href");
	}
	
	
	
	
}
