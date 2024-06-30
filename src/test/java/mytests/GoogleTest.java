package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

	@Test
	public void GoogleTitleTest()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
	
	@Test
	public void GoogleUrlTest()
	{
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"));
	}
}
