package LearnSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MockPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));		
		Alert aleart=wait.until(ExpectedConditions.alertIsPresent());
		aleart.accept();
		
			Thread.sleep(2000);

		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("ven");
		
		

		
	}

}
