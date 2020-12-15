package Problem1;

public class InvoiceTest 
{
	public static void main(String[] args) 
	{
		//Creation of several invoice instances
		Invoice invoice1 = new Invoice (1022, 12.33, 5,12,2016); 
		Invoice invoice2 = new Invoice (99, 1345.67, 13,32,2024);
		Invoice invoice3 = new Invoice (2330,500000,7,19,2018);
		Invoice invoice4 = new Invoice (5067,2.59,14,31,2022);
		
		//Takes each invoice instance through the proper functions so they're formatted properly
		invoice1.invoiceRange();
		invoice1.monthRange();
		invoice1.dayRange();
		invoice1.yearRange();
		
		invoice2.invoiceRange();
		invoice2.monthRange();
		invoice2.dayRange();
		invoice2.yearRange();
		
		invoice3.invoiceRange();
		invoice3.monthRange();
		invoice3.dayRange();
		invoice3.yearRange();
		
		invoice4.invoiceRange();
		invoice4.monthRange();
		invoice4.dayRange();
		invoice4.yearRange();
		
		//Displays each invoice 
		System.out.println(invoice1);
		System.out.println(invoice2);
		System.out.println(invoice3);
		System.out.println(invoice4);
	}
}
