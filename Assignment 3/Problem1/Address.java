package Problem1;

public class Address 
{
	//Creation of necessary instance variables
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	
	//Constructor for the class that defines what an address is
	public Address(String Address, String City, String State, int ZipCode)
	{
		streetAddress = Address;
		city = City;
		state = State;
		zipCode = ZipCode;
	}
	
	//toString that nicely formats the output of the address
	public String toString() 
	{
		return ("Delivery Address: " + streetAddress + ", " + city + ", " + state + " " + zipCode);
	}
}
