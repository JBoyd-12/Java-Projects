package Problem2;

public class Motorized extends Vehicle
{
	//Additional attributes for this vehicle type
	private String Brand;
	private double EngineVolume;
	
	//Constructor for class
	public Motorized(String owner, int NumberOfWheels, String brand, double engineVolume)
	{
		super(owner, NumberOfWheels); //super method to allow for use of variables within super class constructor 
		Brand = brand;
		EngineVolume = engineVolume;
	}
	
	//Protected method that calculates the horsepower of the vehicle
	protected double calculateHorsePower()
	{
		int numberOfWheels = getNumberOfWheels();
		return (EngineVolume * numberOfWheels);
	}
	
	//toString that outputs the information nicely
	public String toString()
	{
		return "Vehicle Type: Motorized \nOwner: " + getOwner() + "\nNumber of wheels: " + getNumberOfWheels() + "\nBrand: " + Brand 
				+ "\nEngine Volume: " + EngineVolume + " L\nHorsepower: " + calculateHorsePower();
	}
	
	//Getter methods
	public String getBrand() 
	{
		return Brand;
	}

	public double getEngineVolume() 
	{
		return EngineVolume;
	}

}
