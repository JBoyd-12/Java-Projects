package Problem2;

public class IceCreamCone 
{
	//creation of instance variables
	private String Flavor;
	private int Scoops;
	final String[] FLAVORS = {"Vanilla", "Choclate", "Mint", "Strawberry"};
	private IceCreamConeException exception1 = new IceCreamConeException("This is not an acceptable flavor."); //creates an exception message
	private IceCreamConeException exception2 = new IceCreamConeException("You can't have that many scoops."); //creates an exception message 
	
	//creation of constructor
	public IceCreamCone(String flavor, int scoops) throws IceCreamConeException
	{
		setFlavor(flavor, exception1);
		setScoops(scoops, exception2);
		
	} //end constructor
	
	//setter methods
	public void setFlavor(String flavor, IceCreamConeException exception1) throws IceCreamConeException 
	{	
		if((!flavor.equalsIgnoreCase(FLAVORS[0])) && (!flavor.equalsIgnoreCase(FLAVORS[1]))  && (!flavor.equalsIgnoreCase(FLAVORS[2]))  && (!flavor.equalsIgnoreCase(FLAVORS[3])))
		{
			throw exception1;
			
		}//end if
		else
		{
			this.Flavor = flavor;
			
		}//end else
			
			
	} //end setFlavor

	public void setScoops(int scoops, IceCreamConeException exception2) throws IceCreamConeException
	{
		if(scoops > 4)
		{
			throw exception2;
			
		} //end if
		else 
		{
			this.Scoops = scoops;
			
		}//end else
		
	} //end setScoops
	
	//getter methods
	public String getFlavor() 
	{
		return Flavor;
		
	} //end getFlavor 
	
	public int getScoops() 
	{
		return Scoops;
		
	} //end getScoops
	
	public String[] getFLAVORS() 
	{
		return FLAVORS;
		
	} //end getFlavors
	
	public String toString()
	{
		return "Flavor: " + Flavor + "\nNumber of Scoops: " + Scoops + "\n";
		
	}//end toString
	
} //end class 
