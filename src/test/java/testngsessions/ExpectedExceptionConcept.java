package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name;
	@Test(description="Adding elements validation", priority = 3, expectedExceptions = Exception.class)

	//@Test(description="Adding elements validation", priority = 3, expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void addToCartTest()
	{
		System.out.println("T -- addtocarttest");
//		int i=9/0; // ArithmeticException  
//		System.out.println("after exception");
		
		
		ExpectedExceptionConcept obj= null;
		System.out.println(obj.name); //null pointer
	}
}
