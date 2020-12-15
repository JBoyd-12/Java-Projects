package Problem1;

import java.util.ArrayList; //imports ArrayList class
import java.util.Scanner; //imports scanner class so user input can be read in

public class PackageDelivery extends Package //Allows for use of variables and methods within Package class
{
	public PackageDelivery(int totalWeight, Shipping ShippingMethod, Address destination)
	{
		super(totalWeight, ShippingMethod, destination); //Refers for super class in order to use variables
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); //Creation of scanner
		
		//Variables to help collect data
		int weight;
		String shipment;
		String streetAddress;
		String city;
		String state;
		int zipCode;
		
		ArrayList<Package> packageList = new ArrayList<Package>(); //Creation of array
		
		//Questions that ask for information and scan it in
		System.out.print("How much does your package weigh(in ounces)? ");
		weight = scan.nextInt();
		Integer totalWeight = weight;
		System.out.print("How would you like your package to be shipped (A G or S)? ");
		shipment = scan.next();
		Package.Shipping tempShip = null;
			
		//Switch statement that matches user input to proper shipment value
		switch (shipment)
		{
			case "A":
				tempShip = Shipping.Air;
			break;
			case "S":
				tempShip = Shipping.Sea;
			break;
			case "G":
				tempShip = Shipping.Ground;
			break;	
		}
			
		//Collects information for address
		System.out.print("What's your street Address? ");
		scan.nextLine();
		streetAddress = scan.nextLine();
		System.out.print("What city do you live in? ");
		//scan.nextLine();
		city = scan.nextLine();
		System.out.print("What state do you live in? ");
		state = scan.nextLine();
		System.out.print("What's your zip code? ");
		zipCode = scan.nextInt();
		
		Address address = new Address (streetAddress, city, state, zipCode); //Stores collected information within Address variable
		Package p = new Package(totalWeight, tempShip, address); //Stores collected information within package variable
		packageList.add(p); //Stores package variable within ArrayList
		p.calculateCost(); //Performs method to calculate cost of package
		p.GenerateID(); //Performs method to generate tracking ID
		
		System.out.print("\n\tPackage List\n------------------------------");
		
		//For loop that displays all instances within array
		for (int counter = 0; counter < packageList.size(); counter++)
		{
			System.out.println(packageList.get(counter).toString());
		}
		
		String Choice;
		System.out.print("\nWould you like to add or remove any packages (A R or N)? "); //Ask user if they want to add or remove an item
		Choice = scan.next();
		
		//While loop that allows for continuous removal or addition of packages
		while (Choice != "N")
		{
			//Switch statement that based off of user choices allows for them to add a package or remove one
			switch (Choice)
			{
				case "A":
					System.out.print("\nHow much does your package weigh(in ounces)? ");
					weight = scan.nextInt();
					Integer totalWeight2 = weight;
					System.out.print("How would you like your package to be shipped (A G or S)? ");
					shipment = scan.next();
					Package.Shipping tempShip2 = null;
					
					//Switch statement that matches user input to proper shipment value
					switch (shipment)
					{
						case "A":
							tempShip2 = Shipping.Air;
						break;
						case "S":
							tempShip2 = Shipping.Sea;
						break;
						case "G":
							tempShip2 = Shipping.Ground;
						break;	
					}

					//Collects information for address
					System.out.print("What's your street Address? ");
					scan.nextLine();
					streetAddress = scan.nextLine();
					System.out.print("What city do you live in? ");
					city = scan.nextLine();
					System.out.print("What state do you live in? ");
					state = scan.nextLine();
					System.out.print("What's your zip code? ");
					zipCode = scan.nextInt();
					
					Address address2 = new Address (streetAddress, city, state, zipCode); //Stores collected information within Address variable
					Package p2 = new Package(totalWeight2, tempShip2, address2); //Stores collected information within array
					packageList.add(p2); //Stores package variable within ArrayList
					p2.calculateCost(); //Performs method to calculate cost of package
					p2.GenerateID(); //Performs method to generate tracking ID
					
					System.out.print("\n\tPackage List\n------------------------------");
					//For loop that displays all instances within array
					for (int counter = 0; counter < packageList.size(); counter++)
					{
						System.out.println(packageList.get(counter).toString());
					}
					
					System.out.print("\nWould you like to add or remove any packages (A R or N)? ");
					Choice = scan.next();
				break;
				case "R":
					int size;
					System.out.print("\nWhich package within the list would you like to remove? ");
					size = scan.nextInt();
					
					packageList.remove(size-1); //Removes package from ArrayList
					
					System.out.print("\n\tPackage List\n------------------------------");
					//For loop that displays all instances within array
					for (int counter = 0; counter < packageList.size(); counter++)
					{
						System.out.println(packageList.get(counter).toString());
					}
					
					System.out.print("\nWould you like to add or remove any packages (A R or N)? ");
					Choice = scan.next();
				break;
				case "N":
						return;
			}
		}
	}

}
