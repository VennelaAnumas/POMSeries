package mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest{
	
	WebDriver driver;

	@Parameters({ "browser","url" })
	@BeforeTest
 public void setup(String browserName, String url) throws Exception
 {
		
		switch (browserName.toLowerCase().trim()) 
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
		    break;
		default:
			System.out.println("please pass the right browser"+browserName);
			throw new Exception("wrong browser passed");
		}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(url);
	
 }


@AfterTest
public void tearDown()
{
	driver.quit();
}
}
