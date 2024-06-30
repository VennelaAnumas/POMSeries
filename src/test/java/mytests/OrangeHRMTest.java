package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{

	
	@Test
	public void OrangeTitleTest()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Human Resources Management Software | OrangeHRM");
	}
	
	@Test
	public void OrangeUrlTest()
	{
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("orangehrm"));
	}
}
