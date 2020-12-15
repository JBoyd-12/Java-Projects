package Problem2;

public abstract class Vehicle 
{
	//Creation of private attributes
	private String Owner;
	private int NumberOfWheels;
	
	//Constructor for class
	public Vehicle (String owner, int numberOfWheels)
	{
		Owner = owner;
		NumberOfWheels = numberOfWheels;
	}
	
	//Getter methods
	public String getOwner() 
	{
		return Owner;
	}
	
	public int getNumberOfWheels() 
	{
		return NumberOfWheels;
	}

}
