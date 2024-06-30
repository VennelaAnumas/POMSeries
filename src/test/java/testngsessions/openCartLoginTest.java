package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class openCartLoginTest {

	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	@Test(description="checking login page title...") 	// custom decription can be written
	
	public void loginPageTitleTest()
	{
	String title =	driver.getTitle();
	System.out.println("title = "+title);
	
	Assert.assertEquals(title, "Account Login","-------title is not matched----------"); // custom message can be written
	}
	
	@Test
	public void loginPageUrlTest()
	{
		String url=driver.getCurrentUrl();
		System.out.println("url = "+url);
		Assert.assertTrue(url.contains("route=account/login"));
	}
	
	@Test
	public void loginPageLogoTest()
	{
		boolean flag=driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		Assert.assertEquals(flag, true);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
