package LearnSelenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
 	private WebDriver driver;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver=driver;
	
	}
	
	
	private void nullCheck(String value)
	{
		if (value==null)
    	{
    		throw new ElementException("VALUE IS NULL"+value);
    	}
	}
	
	
    public  void doSendKeys(By locator,String value)
    {
    	nullCheck(value);
    	getElement(locator).sendKeys(value);
    }
    
    public  WebElement getElement(By locator)
	{
		try {
			
		WebElement element=	 driver.findElement(locator);
		return element;
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return null;
		}
	}
    
    public void doClick(By Locator)
	{
		getElement(Locator).click();
	}
    
    public  String doGetText(By locator)
	{
		return getElement(locator).getText();
	}
    
    public String doGetAttribute(By locator,String attr)
	{
		return driver.findElement(locator).getAttribute(attr);
	}
    
    public  List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public  int  getElementsCount(By locator)
	{
		return getElements(locator).size();
	}
	
    public  List<String> getElementsTextList(By locator)
	{
		List<WebElement> elelist=getElements(locator);
		List<String> eletextlist=new ArrayList<>();
		
		for (WebElement e : elelist) {
			String text=e.getText();
			if(text.length()!=0)
			{
				eletextlist.add(text);
			}
			
		}
		return eletextlist;

	}
    
    public  List<String> getElementAttributeList(By locator,String attr)
	{
		
		List<WebElement> imagelist=getElements(locator);
		List<String> attrlist=new ArrayList<String>();
		
		for (WebElement e : imagelist) 
		{	
		String attrvalue=	e.getAttribute(attr);
			if (attrvalue!=null)
			{
				attrlist.add(attrvalue);
				System.out.println(attrvalue);
			}
	   }
		return attrlist;
	}


}
