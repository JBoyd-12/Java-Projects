package Problem1;

//importing of necessary classes
import java.util.ArrayList;
import java.util.Scanner;

public class Subscribers 
{
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); //Creation of scanner object
		ArrayList<NewsPaperSubscriber> SubscribersList = new ArrayList<NewsPaperSubscriber>(); //Creation of array list
		
		//variables to collect information
		String Address;
		String choice;
		String addAnother;
		
		System.out.println("Enter your address:");
		Address = scan.nextLine();
		System.out.println("Which service would you like to request (S, F, or T)");
		choice = scan.nextLine();
		
		//switch statement to add proper subscription service to array
		switch(choice)
		{
			case "S":
				SevenDaySubscriber sevenDays = new SevenDaySubscriber(Address);
				SubscribersList.add(sevenDays);
			break;
			case "F":
				WeekdaySubscriber fiveDays = new WeekdaySubscriber(Address);
				SubscribersList.add(fiveDays);
			break;
			case "T":
				WeekendSubscriber twoDays = new WeekendSubscriber(Address);
				SubscribersList.add(twoDays);
			break;
			
		}// end switch
		
		System.out.println("Would you like to add another subscription? (Y or N)");
		addAnother = scan.nextLine();
		
		String decision = "Y";
		
		//while loop that allows user to add more subscriptions as requested
		while (addAnother.equals(decision))
		{
			System.out.println("\nEnter your address:");
			Address = scan.nextLine();
			
			//for loop to test for duplicate addresses
			boolean equals = false;
			for(int count = 0; count < SubscribersList.size(); count++)
			{
				if(SubscribersList.get(count).getStreetAddress().equals(Address))
				{
					equals = true;
					break;
					
				} //end if
				
			} // end for
			if(equals == true)
			{
				System.out.println("Invalid: One address cannot have more than one service.");
				
			} //end if
			else
			{
				System.out.println("Which service would you like to request (S, F, or T)");
				choice = scan.nextLine();
			
				//switch statement to add proper subscription service to array
				switch(choice)
				{
					case "S":
						SevenDaySubscriber sevenDays = new SevenDaySubscriber(Address);
						SubscribersList.add(sevenDays);
					break;
					case "F":
						WeekdaySubscriber fiveDays = new WeekdaySubscriber(Address);
						SubscribersList.add(fiveDays);
					break;
					case "T":
						WeekendSubscriber twoDays = new WeekendSubscriber(Address);
						SubscribersList.add(twoDays);
					break;
				} //end switch
				
			} //end else
			
			System.out.println("Would you like to add another subscription? (Y or N)");
			addAnother = scan.nextLine();
			
		} // end while
		
		System.out.print("\nSubscription List\n-------------------------");
		//for loop that prints out all of the subscriptions in the array
		for (int counter = 0; counter < SubscribersList.size(); counter++)
		{
			System.out.println("\n"+ SubscribersList.get(counter).toString());
			
		}// end for

	}// end main method

} // end class
