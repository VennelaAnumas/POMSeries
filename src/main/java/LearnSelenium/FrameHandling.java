package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		
//	driver.switchTo().frame(0);
		System.out.println(driver.switchTo().frame("main").getTitle());
//	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='main']")));
	
	
	}

}
