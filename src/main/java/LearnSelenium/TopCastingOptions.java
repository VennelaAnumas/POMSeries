package LearnSelenium;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//1. valid and recommended
		WebDriver driver= new ChromeDriver();
		
		//2. valid but not recommended - only 2 methods (FE, FEs available)
		SearchContext driver1=new ChromeDriver();
		
		//3.  valid and recommended
		RemoteWebDriver driver2= new ChromeDriver();
		
//		//4. valid and recommended - used in remote exececution(aws,cloud,server,VM,maching) with GRID
//		WebDriver driver3= new RemoteWebDriver(remoteaddress, capabilities);
//		
//		//5 . valid but not recommended - chrominum has only edge and chrome
//		SearchContext driver4= new RemoteWebDriver(remoteaddress, capabilities);
		
		//6. valid but not recommended
		ChromiumDriver driver5= new ChromeDriver();
		ChromiumDriver driver6= new EdgeDriver();

		
	}

}
