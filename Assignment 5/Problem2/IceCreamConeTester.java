package Problem2;

import java.util.Scanner;

public class IceCreamConeTester 
{
	public static void main(String[] args) 
	{
		//variables to collect information
		Scanner scan = new Scanner(System.in);
		IceCreamCone[] cones = new IceCreamCone[10];
		String Flavor;
		int Scoops;
		int count = 0;
		int coneNumber = 0;
		
		//output and input statements to collect information
		System.out.println("Choose an ice cream flavor (Vanilla, Choclate, Mint, or Strawberry):");
		Flavor = scan.nextLine();
		System.out.println("How many scoops would you like (4 maximum)?");
		Scoops = scan.nextInt();
		
		//while loop that allows the user to enter in 10 different ice cream combinations
		while (count <= 9)
		{
			boolean valid = true;
			
			//try and catch statement to deal with exceptions
			try
			{
				IceCreamCone Cone = new IceCreamCone(Flavor, Scoops);
				cones[coneNumber] = Cone;
				coneNumber++;
				
			}//end try
			catch(IceCreamConeException exception)
			{
				System.out.println(exception.getMessage());
				valid = false;
				
			}//end catch
			
			if(valid == true)
			{
				System.out.println("This is a valid combination.");
				
			}//end if
			
			count++;
			
			if(count == 10)
			{
				break;
				
			}//end if
			else
			{
				System.out.println("--------------------------------------------");
				//output and input statements to collect information
				System.out.println("\nChoose an ice cream flavor (Vanilla, Choclate, Mint, or Strawberry):");
				scan.nextLine();
				Flavor = scan.nextLine();
				System.out.println("How many scoops would you like (4 maximum)?");
				Scoops = scan.nextInt();
				
			}//end else
			
		}//end while
		
		//prints out all valid IceCreamCone Instances
		System.out.println("\nAccepted Ice Cream Cones\n--------------------------");
		for (int counter = 0; counter < coneNumber; counter++)
		{
			System.out.println(cones[counter].toString());
			
		}//end for

	}//end main method

} //end class
