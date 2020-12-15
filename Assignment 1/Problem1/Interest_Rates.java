package Problem1;

import java.text.NumberFormat; // Imports number formatting features 
import java.util.Scanner; // Imports scanner to allow for user input

public class Interest_Rates 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Initializes scanner
		NumberFormat fmt = NumberFormat.getCurrencyInstance(); // Creates variable to format numbers with $
		
		double investment = 0; // Creates variable for investment value
		double interest_rate = 0; // Creates variable for interest rate
				
		System.out.print("Enter an investment amount: "); // Prompts user for investment amount
		investment = scan.nextDouble(); // Reads in user input
		System.out.print("Enter an interest rate (type in decimal format): "); // Prompts user for interest rate value
		interest_rate = scan.nextDouble(); // Reads in user input
		
		
		double Future_value1 = investment * Math.pow(1 + interest_rate, 5); // Formula to calculate investment after 5 years
		double Future_value2 = investment * Math.pow(1 + interest_rate, 10); // Formula to calculate investment after 10 years
		double Future_value3 = investment * Math.pow(1 + interest_rate, 20); // Formula to calculate investment after 20 years
		
		System.out.println("\nValue of investment in 5 years: " + fmt.format(Future_value1)); //Outputs final values for investment
		System.out.println("Value of investment in 10 years: " + fmt.format(Future_value2)); //Outputs final values for investment
		System.out.println("Value of investment in 20 years: " + fmt.format(Future_value3)); //Outputs final values for investment

	}

}
