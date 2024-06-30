package LearnSelenium;

import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {

//		String browser="chrome";
		
		ReadProperty  rp=new ReadProperty();
		String browser=rp.initprop().getProperty("BrowserName");
		
		String url="https://naveenautomationlabs.com/opencart/";
		BrowserUtil brutil= new BrowserUtil();
		WebDriver driver=brutil.LaunchBrowser(browser);
		brutil.LaunchUrl(url);
		
String actTitle =brutil.getpageTitle();		
System.out.println("acttitle = "+actTitle);
		
		//validate or check
		
		if(actTitle=="chrome")
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("not correct title");
			//throw new BrowserException("invalid title accounted");
		}
brutil.quitbrowser();
	}

	
}
