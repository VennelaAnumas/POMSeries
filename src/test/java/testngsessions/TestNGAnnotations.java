package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGAnnotations {

	//BS
	//BT
	//BC
	    //BM
	    //T
	    //AM
    //AC
	//AT
	//AS
	
	@BeforeSuite
	public void connectWithDB()
	{
		System.out.println("BS--CONNECT WITH DB");
	}
	
	@BeforeTest
	public void createuser()
	{
		System.out.println("BT -- create user");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BC -- launchbrowser");
	}
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println("BM -- login to app");
	}
	@Test
	public void serchTest2()
	{
		System.out.println("T2 -searchtest");
	}
	@Test

	public void serchTest1()  
	{
		System.out.println("T1 -searchtest");
	}
	@Test
	public void addToCartTest()
	{
		System.out.println("T -- addtocarttest");
	}
	@Test
	public void checkOutTest()
	{
		System.out.println("T --  checkout test");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("AM -- logout");
	}
	@AfterClass	
	public void closeBrowser()
	{
		System.out.println("AC -- closebrowser");
	}
	@AfterTest
	public void deleteUser()
	{
		System.out.println("AT -- deleteuser");
	}
	@AfterSuite
	public void disconnectWithDB()
	{
		System.out.println("AS -- disconnectwith db");
	}
	
}

