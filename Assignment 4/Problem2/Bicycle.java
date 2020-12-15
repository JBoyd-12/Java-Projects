package Problem2;

public class Bicycle extends Vehicle
{
	//Additional attribute for this vehicle type
	private String Brand;
	
	//Constructor for class
	public Bicycle(String owner, int NumberOfWheels, String brand)
	{
		super(owner, NumberOfWheels); //super method to allow for use of variables within super class constructor
		Brand = brand;
	}
	
	//toString that outputs the information nicely
	public String toString()
	{
		return "Vehicle Type: Bicycle \nOwner: " + getOwner() + "\nNumber of wheels: " 
				+ getNumberOfWheels() + "\nBrand: " + Brand;
	}
	
	//Getter method
	public String getBrand() 
	{
		return Brand;
	}
	
}
