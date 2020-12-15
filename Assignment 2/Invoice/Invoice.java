package Problem1;

import java.text.NumberFormat;

public class Invoice 
{
	private int invoiceNumber;
	private double balanceDue;
	private int month;
	private int day;
	private int year;
	
	// Constructor for class
	public Invoice(int invoiceNumber, double balanceDue, int month, int day, int year)
	{
		this.invoiceNumber = invoiceNumber;
		this.balanceDue = balanceDue;
		this.month = month;
		this.day = day;
		this.year = year;
		
	}
	
	// Functions that retrieve the value of each field
	public void setInvoice(int invoiceNumber)
	{
		this.invoiceNumber = invoiceNumber; //refers to the proper object for the invoice number
	}
	
	public void setBalance(double balanceDue)
	{
		this.balanceDue = balanceDue; //refers to the proper object for the balance due number
	}
	
	public void setMonth (int month)
	{
		this.month = month; //refers to the proper object for the month
	}
	
	public void setDay (int day)
	{
		this.day = day; //refers to the proper object for the day
	}
	
	public void setYear (int year)
	{
		this.year = year; //refers to the proper object for the year
	}
	
	//Functions that check to make sure each value is within the proper range 
	public int invoiceRange()
	{
		if (invoiceNumber < 1000) //checks if the value is valid and if not sets it to 0
		{
			invoiceNumber = 0;
		}
		
		return invoiceNumber;
	}
	
	public int monthRange()
	{
		if((month > 12) || (month < 1)) //checks if the value is valid and if not sets it to 0
		{
			month = 0;
		}
		
		return month;
	}
	
	public int dayRange()
	{
		if((day > 31) || (day < 1)) //checks if the value is valid and if not sets it to 0
		{
			day = 0;
		}
		
		return day;
	}
	
	public int yearRange()
	{
		if((year > 2022) || (year < 2015)) //checks if the value is valid and if not sets it to 0
		{
			year = 0;
		}
		
		return year;
	}
	
	
	//Functions that send the proper value back out to be displayed
	public int getInvoice()
	{
		return invoiceNumber; //returns the value of the invoice after checking if it is valid
	}
	
	public double getBalance()
	{
		return balanceDue; //returns the value of the balance after checking if it is valid
	}
	
	public int getMonth()
	{
		return month; //returns the value of the month after checking if it is valid
	}
	
	public int getDay()
	{
		return day; //returns the value of the day after checking if it is valid
	} 
	
	public int getYear()
	{
		return year; //returns the value of the year after checking if it is valid
	}
	
	public String toString() //a to string to format the output nicely
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance(); //Used to format currency output properly
		return ("Invoice Number: " + invoiceNumber +"\n" + "Balance Due: " + fmt.format(balanceDue)  + "\nDue Date: " + month + "/" + day + "/" + year + "\n");
	}
}
