package LearnSelenium;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(3000);

		String ele=driver.findElement(with(By.partialLinkText("Drayton Valley, Canada"))).getText();
		System.out.println(ele);
		
		
	}

}
