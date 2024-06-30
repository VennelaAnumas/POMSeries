package testngsessions;

import org.testng.annotations.Test;

public class DependsOnConcept {
	
	
	@Test
	public void loginTest()
	{
		System.out.println("login test");
		int i=9/0;
	}

	@Test(dependsOnMethods="loginTest")
	public void addToCartTest()
	{
		System.out.println("login test");
	}
	
	
	///AAA pattern - Arrange, Act, Assert
}
