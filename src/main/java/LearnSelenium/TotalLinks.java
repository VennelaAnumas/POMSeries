package LearnSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	static WebDriver driver;
	public static void main(String[] args) {
 driver= new ChromeDriver();
driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//List<WebElement> linkslist=driver.findElements(By.tagName("a"));
//System.out.println("total links count="+linkslist.size());

//for (WebElement listedlinks : linkslist) {
//	System.out.println(listedlinks.getAttribute("href"));
//	System.out.println(listedlinks.getText());
//	}
//int count=0;
//for (int i=0;i<linkslist.size();i++)
//{
//	String text=linkslist.get(i).getText();	
//	if(text.length()!=0)
//	{
//		System.out.println(text);
//		count++;
//	}
//
//}
//System.out.println("links having linktext="+count);
//System.out.println("blank link text count="+ ""+ (linkslist.size()-count));

By links=By.tagName("a");
By images=By.tagName("img");

//System.out.println("images count="+getElementsCount(images));
//System.out.println("links count="+getElementsCount(links));
//System.out.println(getElementsTextList(links));

ElementUtil eleutil= new ElementUtil(driver);
 	List<String> linkstextlist=eleutil.getElementsTextList(links);
 	
 	System.out.println(linkstextlist);
 	System.out.println(linkstextlist.contains("Components"));
	}
	
	
	
	
	
}

