package LearnSelenium;

// creating own exception class
public class BrowserException extends RuntimeException{
	
	public  BrowserException(String msg)
	{
		super(msg); // same msg is given to runtimeexception, so that at runtime exception will be thrown
		// super() gives you access to methods in a superclass from the subclass that inherits from it. 
		//super() alone returns a temporary object of the superclass that then allows you to call that superclass's methods.
	}

}
