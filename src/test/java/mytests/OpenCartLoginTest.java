package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest{

	@Test
	public void OpenCartTitleTest()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test
	public void OpenCartUrlTest()
	{
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("route=account/login"));
	}
}
