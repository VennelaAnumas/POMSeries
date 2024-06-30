package LearnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
 driver.get("https://www.google.com/");

 String title = driver.getTitle();
 System.out.println("title="+title);
 if(title.equals("Google"))
 {
	 System.out.println("title is correct");
 }
 else {
	 System.out.println("title is incorrect");
 }
 
 String currenturl=driver.getCurrentUrl();
 System.out.println("currenturl = "+currenturl);
 if(currenturl.contains("goog"))
 {
	 System.out.println("currenturl is correct");
	
 }
 else
 {
	 System.out.println("currenturl is incorrect");
 }
 driver.close();

	}

}
