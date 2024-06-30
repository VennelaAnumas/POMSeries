package LearnSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		
		Thread.sleep(2000);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it= handles.iterator();		
		String parenthandle=it.next();
		System.out.println("parenthandle ="+parenthandle);
		String childhandle=it.next();
		System.out.println("childhandle ="+childhandle);
		Thread.sleep(2000);

		driver.switchTo().window(childhandle);
		
		
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> its=handle.iterator();
	}

}
