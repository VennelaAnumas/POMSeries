package mytests;

import java.util.UUID;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseTest{
	
	public static String getRandomEmailId()
	{
		String gmailId="opencart"+System.currentTimeMillis() +"@gmail.com";
		//String gmailId="opencart"+ UUID.randomUUID()+"gmail.com";  // it will generate 12- 16 digitnum, so using millisec is btr
		return gmailId;
	}
	
@DataProvider
public Object[][] getRegTestData()
{
	return new Object[][] {
		{"ssvv","ar","9865359096","asdrt123"},
		{"qwwe","qw","9875345706","qwesw123"}
		};
}
	
	
@Test(dataProvider="getRegTestData")
public void registerTest(String firstName, String lastName, String phn, String Pwd) throws InterruptedException
{
	driver.findElement(By.id("input-firstname")).sendKeys(firstName);
	driver.findElement(By.id("input-lastname")).sendKeys(lastName);
	driver.findElement(By.id("input-email")).sendKeys(getRandomEmailId());
	Thread.sleep(3000);
	driver.findElement(By.id("input-telephone")).sendKeys(phn);
	driver.findElement(By.id("input-password")).sendKeys(Pwd);
	driver.findElement(By.id("input-confirm")).sendKeys(Pwd);

	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	Thread.sleep(3000);

	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	Thread.sleep(3000);

 String hdr=	driver.findElement(By.xpath("//div[@id='content']/h1")).getText();	
 Assert.assertEquals(hdr, "Your Account Has Been Created!");
 
 driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);

 driver.findElement(By.linkText("Register")).click();
 
}
}
