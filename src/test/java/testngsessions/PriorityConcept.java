package testngsessions;

import org.testng.annotations.Test;

public class PriorityConcept
{

	
	@Test(priority = 2, description="validating search")
	public void serchTest()  
	{
		System.out.println("T -searchtest");
	}
	
	@Test(description="Adding elements validation", priority = 3)
	public void addToCartTest()
	{
		System.out.println("T -- addtocarttest");
	}
	
	@Test(priority = -1)
	public void checkinTest()
	{
		System.out.println("T --  checkin test");
	}
	
	@Test(priority = -2)
	public void PaymentTest()
	{
		System.out.println("T --  Payment test");
	}
	
	@Test
	public void checkOutTest()
	{
		System.out.println("T --  checkout test");
	}
	

	
	
}
