package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
	 static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By frgtpwd=By.linkText("Forgotten Password");
//	String hrefval=	driver.findElement(frgtpwd).getAttribute("href");//attribute
//	System.out.println(hrefval);
//	String classval= driver.findElement(frgtpwd).getAttribute("class"); //locator
//	System.out.println(classval);

//		System.out.println(doGetAttribute(frgtpwd, "href"));

		ElementUtil eleutil=new ElementUtil(driver);
		String attrval=eleutil.doGetAttribute(frgtpwd, "href");
		System.out.println(attrval);
	}
	
	

}
