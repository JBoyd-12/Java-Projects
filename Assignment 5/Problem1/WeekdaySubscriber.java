package Problem1;

//import number format class
import java.text.NumberFormat;

public class WeekdaySubscriber extends NewsPaperSubscriber
{
	//constructor for class
	public WeekdaySubscriber(String Address)
	{
		super(Address); //Refers to super class constructor
		setRate();
	}
	
	//setRate method to specify rate for subscription
	protected double setRate()
	{
		double SubscriptionRate = 7.5;
		return SubscriptionRate;
	}
	
	//toString to nicely format the output of information
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
			
		return "Address: " + getStreetAddress() + "\nRate: " + fmt.format(setRate()) + 
				"\nService Type: Weekday Subscriber";
	}
	
}// end class
