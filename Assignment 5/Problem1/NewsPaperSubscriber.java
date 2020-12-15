package Problem1;

public abstract class NewsPaperSubscriber 
{
	//instance variables
	private String StreetAddress;
	private double SubscriptionRate;
	
	//constructor for class
	public NewsPaperSubscriber(String Address)
	{
		StreetAddress = Address;
	}
	
	//getters and setters
	protected String getStreetAddress()
	{
		return StreetAddress;
	}

	protected double getRate() 
	{
		return SubscriptionRate;
	}

	abstract protected double setRate();
	
	//equals method to test if two subscribers are equal
	protected boolean equals(String Address1)
	{
		boolean equal = false;
		
		if(StreetAddress.equals(Address1))
		{
			equal = true;
		}
		else
		{
			equal = false;
		}
		
		return equal;
	}
	
} // end class