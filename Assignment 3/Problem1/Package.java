package Problem1;

import java.util.Random; //imports random number generator
import java.text.NumberFormat;

public class Package 
{
	//creation of necessary instance variables 
	private int TrackingID;
	private int Weight;
	private double Cost;
	private Address Destination;
	public enum Shipping{Air,Ground,Sea};
	private Shipping shipMethod;
	
	//Constructor that accepts arguments for weight and shipping method
	public Package (int totalWeight, Shipping ShippingMethod, Address destination)
	{
		Weight = totalWeight;
		shipMethod = ShippingMethod;
		Destination = destination;
	}
	
	//Method that determines the cost of a package delivery based on weight and method of shipment
	public double calculateCost()
	{ 
		if ((Weight >= 1) && (Weight <= 8))
		{
			if (shipMethod == Shipping.Air)
			{
				Cost = 4.00;
			}
			else if (shipMethod == Shipping.Ground)
			{
				Cost = 1.80;
			}
			else if (shipMethod == Shipping.Sea)
			{
				Cost = 0.55;
			}
		}
		
		else if ((Weight >= 9) && (Weight <= 16))
		{
			if (shipMethod == Shipping.Air)
			{
				Cost = 6.00;
			}
			else if (shipMethod == Shipping.Ground)
			{
				Cost = 2.80;
			}
			else if (shipMethod == Shipping.Sea)
			{
				Cost = 1.50;
			}
		}
		
		else if (Weight >= 17)
		{
			if (shipMethod == Shipping.Air)
			{
				Cost = 9.00;
			}
			else if (shipMethod == Shipping.Ground)
			{
				Cost = 4.00;
			}
			else if (shipMethod == Shipping.Sea)
			{
				Cost = 2.00;
			}
		}
		
		return Cost;
	}
	
	//Method that generates a random 6 digit number to represent the tracking number
	public int GenerateID()
	{
		Random random = new Random();
		TrackingID = random.nextInt(999999) + 100000;
		
		return TrackingID;
	}
	
	//toString that nicely formats the package information
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return("\nID Number: " + TrackingID + "\nWeight(Ounces): " + Weight + "\nShipping Method: " 
				+ shipMethod + "\nCost: " + fmt.format(Cost) + "\n" + Destination);
	}
	
	//getter for the value of weight
	public int getWeight()
	{
		return Weight; //returns the value of weight
	}
}
