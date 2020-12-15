package Problem2;

public class IceCreamConeException extends Exception
{
	private String Message;
	
	//constructor for class
	public IceCreamConeException(String errorMessage)
	{
		Message = errorMessage;
	}
	
	//getter method
	public String getMessage() 
	{
		return Message;
	}
	
} //end class
