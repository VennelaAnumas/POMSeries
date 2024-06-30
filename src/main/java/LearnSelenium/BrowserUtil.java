package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	WebDriver driver;
	
	public WebDriver LaunchBrowser(String Browsername)
	{
		System.out.println("browsername="+Browsername);
	switch (Browsername.trim().toLowerCase()) {
	case "chrome":
		driver =new ChromeDriver();
		break;
	case "firefox":
		driver=new FirefoxDriver();
	case "Safari":
		driver= new SafariDriver();
	case "edge":
		driver= new EdgeDriver();	
		
	
	default:
		System.out.println("driver does not exists, provide the correct browsername"+Browsername );
		
		// throw an exception 
		throw new BrowserException("invalid browser name = "+Browsername);
		// throw and break cannot be together, throw is last
	}
	return driver;
		
	}
	
	public void LaunchUrl(String url)
	{
		if (url==null)
		{
			throw new BrowserException("INVALID URL="+url);
		}
		if (url.isBlank()||url.isEmpty())
		{
			throw new BrowserException("URL IS BLANK/EMPTY="+url);
		}
		if(url.indexOf("http")!=0)
		{
			throw new BrowserException("INVALID URL WITHOUT HTTP="+url);
		}
		
		driver.get(url.trim());
	}
	
	public String getpageTitle()
	{
		return driver.getTitle();
		}
	
	public String getpagecurrenturl()
	{
		return driver.getCurrentUrl();
		 
	}
	
	public void quitbrowser()
	{
		driver.quit();
	}
	
	public void closebrowser()
	{
		driver.close();
	}


}
